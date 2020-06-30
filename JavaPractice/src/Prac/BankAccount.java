package Prac;

// ���¹�ȣ, ��������, �ݾ� �� ��
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BankAccount {
	private static String mAccount;
	private static String mAccountHolder;
	private static int mAmount;
	private static boolean isDone = false;

	public BankAccount(String account, String holder, int amount) {
		mAccount = account;
		mAccountHolder = holder;
		mAmount = amount;
	}

	public static boolean deposit(int amount) { // �Ա� �˸� : deposit(�ݾ�)
		if (!isPositiveAmount(amount))
			return false;

		mAmount += amount;

		String strFormat = "%s �� �Ա��մϴ�.%n";
		System.out.printf(strFormat, convertToDecimalFormat(amount));

		printAmount();

		return true;
	}

	public static boolean withDraw(int amount) { // ��� �˸� : withDraw(�ݾ�)
		if (!isPositiveAmount(amount))
			return false;
		if (!canWithdraw(amount))
			return false;

		mAmount -= amount;

		String strFormat = "%s �� ����մϴ�.%n";
		System.out.printf(strFormat, convertToDecimalFormat(amount));

		printAmount();
		return true;
	}

	private static void printAmount() { // �ܾ� ��ȸ : printAmount()
		String strFormat = "�ܾ�: %s ��%n";
		System.out.printf(strFormat, convertToDecimalFormat(mAmount));
	}

	public void printStatus() { // ����, ������ , �ܾ� ��ȸ : printStatus
		String strFormat = "���� %s (������:%s)%n�ܾ�: %s ��%n";
		System.out.printf(strFormat, mAccount, mAccountHolder, convertToDecimalFormat(mAmount));
	}

	public String getAccountName() { // ������ ��ȸ : getAccountName()
		return mAccount;
	}

	private static boolean isPositiveAmount(int amount) { // ���� �ԷµǾ����� Ȯ�� : isPositiveAmount(�ݾ�)
		if (amount < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
			return false;
		}

		return true;
	}

	private static boolean canWithdraw(int amount) { // �ܾ� �������� Ȯ�� : canWithdraw(�ݾ�)
		if (mAmount - amount < 0) {
			System.out.println("�����޽��� : [����] �ܾ��� �����մϴ�.");
			return false;
		}

		return true;
	}

	private static String convertToDecimalFormat(int amount) { // ���� ��ȭ�� ���� : covertToDecimalFormat(�ݾ�)
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.KOREA);
		nf.setMaximumFractionDigits(3);
		return nf.format(amount);
	}

	private static void whatDo() { // ������ �Ұ���, �Է� ������

		Scanner input = new Scanner(System.in);
		String notice = "%n�ȳ��ϼ���. ���°��� �ý����Դϴ�. �ʿ��Ͻ� �׸��� �������ּ���.%n";
		// System.out.println("�ȳ��ϼ���. ���°��� �ý����Դϴ�. �ʿ��Ͻ� �׸��� �������ּ���.");
		System.out.printf(notice);
		System.out.println(" 1: ���� �Է�, 2: �ܾ� ��ȸ, 3: �ܾ� �Ա�, 4: �ܾ� ���, 5: ����");
		int select = input.nextInt();

		switch (select) {
		case 1: // �����Է�
			while (true) {
				System.out.print("���¹�ȣ�� �Է����ּ��� : ");
				mAccount = input.next();

				System.out.print("������ �̸��� �Է����ּ��� : ");
				mAccountHolder = input.next();

				System.out.print("���� �ܾ��� �Է����ּ���: ");
				mAmount = input.nextInt();

				String strFormat = "���¹�ȣ: %s / ������:%s / �ܾ�: %s ��%n";
				System.out.printf(strFormat, mAccount, mAccountHolder, convertToDecimalFormat(mAmount));
				System.out.print("�� ������ �����Ű���? (Yes: 1, No: 2) : ");

				int check_account = input.nextInt();

				if (check_account == 1) {
					break;
				} else {
					System.out.println("�ٽ� �Է����ּ���.");
				}

			}
			break;

		case 2: // �ܾ� ��ȸ
			String current_str = "%s ���� �ܾ��� %s �� �Դϴ�. %n";
			System.out.printf(current_str, mAccountHolder, convertToDecimalFormat(mAmount));
			break;
		case 3: // �ܾ� �Ա�
			while (true) {
				System.out.println("�ܾ� �Ա� �ܰ��Դϴ�.");
				System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
				int deposit_input = input.nextInt();

				String deposit_input_form = "%s ���� �½��ϱ�? (Yes: 1, No: 2) : ";
				System.out.printf(deposit_input_form, convertToDecimalFormat(deposit_input));
				int check_deposit = input.nextInt();

				String deposit_str = "%s ���� �Ա��߽��ϴ�. %n";

				if (check_deposit == 1) {
					deposit(deposit_input);

					System.out.printf(deposit_str, convertToDecimalFormat(deposit_input));
					break;
				} else {
					System.out.println("�ٽ� �õ����ּ���.");
				}
			}
			break;

		case 4: // �ܾ� ���
			while (true) {
				System.out.println("�ܾ� ��� �ܰ��Դϴ�.");
				System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
				int withDraw_input = input.nextInt();

				String withDraw_input_form = "%s ���� �½��ϱ�? (Yes: 1, No: 2) : ";
				System.out.printf(withDraw_input_form, convertToDecimalFormat(withDraw_input));
				int check_withDraw = input.nextInt();

				String withDraw_str = "%s ���� ����߽��ϴ�. %n";

				if (check_withDraw == 1) {
					withDraw(withDraw_input);

					System.out.printf(withDraw_str, convertToDecimalFormat(withDraw_input));
					break;
				} else {
					System.out.println("�ٽ� �õ����ּ���.");
				}
			}
			break;
		case 5: // ����
			System.out.println("����");
			isDone = true;
			break;
		}
	}

	public static void main(String[] args) {

		while (!isDone) {
			whatDo();
		}
	}
}