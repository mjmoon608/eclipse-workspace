package Prac;

// 계좌번호, 계좌주인, 금액 등 고객
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

	public static boolean deposit(int amount) { // 입금 알림 : deposit(금액)
		if (!isPositiveAmount(amount))
			return false;

		mAmount += amount;

		String strFormat = "%s 원 입금합니다.%n";
		System.out.printf(strFormat, convertToDecimalFormat(amount));

		printAmount();

		return true;
	}

	public static boolean withDraw(int amount) { // 출금 알림 : withDraw(금액)
		if (!isPositiveAmount(amount))
			return false;
		if (!canWithdraw(amount))
			return false;

		mAmount -= amount;

		String strFormat = "%s 원 출금합니다.%n";
		System.out.printf(strFormat, convertToDecimalFormat(amount));

		printAmount();
		return true;
	}

	private static void printAmount() { // 잔액 조회 : printAmount()
		String strFormat = "잔액: %s 원%n";
		System.out.printf(strFormat, convertToDecimalFormat(mAmount));
	}

	public void printStatus() { // 계좌, 예금주 , 잔액 조회 : printStatus
		String strFormat = "계좌 %s (예금주:%s)%n잔액: %s 원%n";
		System.out.printf(strFormat, mAccount, mAccountHolder, convertToDecimalFormat(mAmount));
	}

	public String getAccountName() { // 예금주 조회 : getAccountName()
		return mAccount;
	}

	private static boolean isPositiveAmount(int amount) { // 음수 입력되었는지 확인 : isPositiveAmount(금액)
		if (amount < 0) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
			return false;
		}

		return true;
	}

	private static boolean canWithdraw(int amount) { // 잔액 부족한지 확인 : canWithdraw(금액)
		if (mAmount - amount < 0) {
			System.out.println("에러메시지 : [에러] 잔액이 부족합니다.");
			return false;
		}

		return true;
	}

	private static String convertToDecimalFormat(int amount) { // 숫자 한화로 변경 : covertToDecimalFormat(금액)
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.KOREA);
		nf.setMaximumFractionDigits(3);
		return nf.format(amount);
	}

	private static void whatDo() { // 무엇을 할건지, 입력 루프문

		Scanner input = new Scanner(System.in);
		String notice = "%n안녕하세요. 계좌관리 시스템입니다. 필요하신 항목을 선택해주세요.%n";
		// System.out.println("안녕하세요. 계좌관리 시스템입니다. 필요하신 항목을 선택해주세요.");
		System.out.printf(notice);
		System.out.println(" 1: 계좌 입력, 2: 잔액 조회, 3: 잔액 입금, 4: 잔액 출금, 5: 종료");
		int select = input.nextInt();

		switch (select) {
		case 1: // 계좌입력
			while (true) {
				System.out.print("계좌번호를 입력해주세요 : ");
				mAccount = input.next();

				System.out.print("예금주 이름을 입력해주세요 : ");
				mAccountHolder = input.next();

				System.out.print("현재 잔액을 입력해주세요: ");
				mAmount = input.nextInt();

				String strFormat = "계좌번호: %s / 예금주:%s / 잔액: %s 원%n";
				System.out.printf(strFormat, mAccount, mAccountHolder, convertToDecimalFormat(mAmount));
				System.out.print("위 정보가 맞으신가요? (Yes: 1, No: 2) : ");

				int check_account = input.nextInt();

				if (check_account == 1) {
					break;
				} else {
					System.out.println("다시 입력해주세요.");
				}

			}
			break;

		case 2: // 잔액 조회
			String current_str = "%s 님의 잔액은 %s 원 입니다. %n";
			System.out.printf(current_str, mAccountHolder, convertToDecimalFormat(mAmount));
			break;
		case 3: // 잔액 입금
			while (true) {
				System.out.println("잔액 입금 단계입니다.");
				System.out.println("얼마를 입금하시겠습니까?");
				int deposit_input = input.nextInt();

				String deposit_input_form = "%s 원이 맞습니까? (Yes: 1, No: 2) : ";
				System.out.printf(deposit_input_form, convertToDecimalFormat(deposit_input));
				int check_deposit = input.nextInt();

				String deposit_str = "%s 원을 입금했습니다. %n";

				if (check_deposit == 1) {
					deposit(deposit_input);

					System.out.printf(deposit_str, convertToDecimalFormat(deposit_input));
					break;
				} else {
					System.out.println("다시 시도해주세요.");
				}
			}
			break;

		case 4: // 잔액 출금
			while (true) {
				System.out.println("잔액 출금 단계입니다.");
				System.out.println("얼마를 출금하시겠습니까?");
				int withDraw_input = input.nextInt();

				String withDraw_input_form = "%s 원이 맞습니까? (Yes: 1, No: 2) : ";
				System.out.printf(withDraw_input_form, convertToDecimalFormat(withDraw_input));
				int check_withDraw = input.nextInt();

				String withDraw_str = "%s 원을 출금했습니다. %n";

				if (check_withDraw == 1) {
					withDraw(withDraw_input);

					System.out.printf(withDraw_str, convertToDecimalFormat(withDraw_input));
					break;
				} else {
					System.out.println("다시 시도해주세요.");
				}
			}
			break;
		case 5: // 종료
			System.out.println("종료");
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