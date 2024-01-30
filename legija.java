import java.util.Scanner;

public class legija {
	public static void main(String args[]) {
		System.out.println("                           ,--.\n"
				+ "                          {    }\n"
				+ "                          K,   }\n"
				+ "                         /  `Y`\n"
				+ "                    _   /   /\n"
				+ "                   {_'-K.__/\n"
				+ "                     `/-.__L._\n"
				+ "                     /  ' /`\\_}\n"
				+ "                    /  ' /     \n"
				+ "            ____   /  ' /\n"
				+ "     ,-'~~~~    ~~/  ' /_\n"
				+ "   ,'             ``~~~%%',\n"
				+ "  (                     %  Y\n"
				+ " {                      %% I\n"
				+ "{      -                 %  `.\n"
				+ "|       ',                %  )\n"
				+ "|        |   ,..__      __. Y\n"
				+ "|    .,_./  Y ' / ^Y   J   )|\n"
				+ "\\           |' /   |   |   ||\n"
				+ " \\          L_/    . _ (_,.'(\n"
				+ "  \\,   ,      ^^\"\"' / |      )\n"
				+ "    \\_  \\          /,L]     /\n"
				+ "      '-_`-,       ` `   ./`\n"
				+ "         `-(_            )\n"
				+ "             ^^\\..___,.--`\n"
				+ "");
		System.out.println("\n"
				+ "\n"
				+ " _   _           _           _                   _               _  _       \n"
				+ "| | | |_ __   __| | ___  ___(_)_ __ ___   __ _  | |    ___  __ _(_)(_) __ _ \n"
				+ "| | | | '_ \\ / _` |/ _ \\/ __| | '_ ` _ \\ / _` | | |   / _ \\/ _` | || |/ _` |\n"
				+ "| |_| | | | | (_| |  __/ (__| | | | | | | (_| | | |__|  __/ (_| | || | (_| |\n"
				+ " \\___/|_| |_|\\__,_|\\___|\\___|_|_| |_| |_|\\__,_| |_____\\___|\\__, |_|/ |\\__,_|\n"
				+ "                                                           |___/ |__/       \n"
				+ "\n"
				+ "");
		
		System.out.println("Добро Пожаловать в Ундецимский легион!");
		System.out.println("-------------------------------------------");
		System.out.println("Welcome to Undecim Legion!");
		System.out.println("-----------------------------------------");
		System.out.println("Grata to Undecima legija!");
		System.out.println("---------------------------------------");
	
		Scanner l = new Scanner(System.in);
		System.out.println("ua, ru, us?");
		String lang = l.nextLine();
		// russian version
		if(lang.equals("ru")) {
			System.out.println();
			System.out.println("Хорошо, начнём с такого вопроса:");
			System.out.println("Вы за свободу кода?");
			
			Scanner openr = new Scanner(System.in);
			System.out.println("n или y: ");
			System.out.println();
			String opensr = openr.nextLine();
			
			if(opensr.equals("y") || opensr.equals("yes")) {
				System.out.println();
				System.out.println("Отлично, тогда продолжаем");
				System.out.println("\"Undecima Legija\" – это эксклюзивный культ, внедренный в сферу программирования и информационных технологий, где пропагандируется философия открытого исходного кода (Open Source), а его члены почти единодушно используют операционные системы GNU/Linux или BSD. Название \"Undecima Legija\" сочетает латинское \"Undecima\", что означает \"одиннадцать\", и слово \"Legija\", обозначающее \"легион\" или \"армия\". Присоединяйся к нам!");
			} 
			else if(opensr.equals("n") || opensr.equals("no")){
				System.out.println();
				System.out.println("Приятно было познакомиться!");
			} else {
				System.out.println();
				System.out.println("А теперь введи нормальный ответ");
			}
		}
		// english verison
		else if(lang.equals("us")) {
			System.out.println();
			System.out.println("Okay, let's start with a question like this:");
			System.out.println("Are you in favor of code freedom?");
			
			Scanner openen = new Scanner(System.in);
			System.out.println("n or y: ");
			String opensen = openen.nextLine();
			
			if(opensen.equals("y") || opensen.equals("yes")) {
				System.out.println();
				System.out.println("All right, then, let's get on with it.");
				System.out.println("\"Undecima Legija\" is an exclusive cult embedded in the programming and information technology industry, where the Open Source philosophy is promoted and its members almost unanimously use the GNU/Linux or BSD operating systems. The name \"Undecima Legija\" combines the Latin \"Undecima\", meaning \"eleven\", and the word \"Legija\", meaning \"legion\" or \"army\". Join us!");
			}
			else if(opensen.equals("n") || opensen.equals("no")) {
				System.out.println();
				System.out.println("Nice to meet you!");
			} else {
				System.out.println();
				System.out.println("Now type in the normal answer");
			}
		}
		// ukrainian version
		else if(lang.equals("ua")) {
			System.out.println();
			System.out.println("Добре, почнемо з такого запитання:");
			System.out.println("Ви за свободу коду?");
			
			Scanner openua = new Scanner(System.in);
			System.out.println("n чи y: ");
			String opensua = openua.nextLine();
			
			if(opensua.equals("y") || opensua.equals("yes")) {
				System.out.println();
				System.out.println("\"Undecima Legija\" - це ексклюзивний культ, впроваджений у сферу програмування та інформаційних технологій, де пропагується філософія відкритого вихідного коду (Open Source), а його члени майже одностайно використовують операційні системи GNU/Linux або BSD. Назва \"Undecima Legija\" поєднує латинське \"Undecima\", що означає \"одинадцять\", і слово \"Legija\", що означає \"легіон\" або \"армія\". Приєднуйся до нас!");
			}
			else if(opensua.equals("n") || opensua.equals("no")) {
				System.out.println();
				System.out.println("Приємно було познайомитися!");
			} else {
				System.out.println();
				System.out.println("А тепер уведи нормальну відповідь");
			}
		} else {
			System.out.println();
			System.out.println("How type in the normal answer");
			System.out.println("-----------------------------------");
			System.out.println("Введите нормальный ответ");
			System.out.println("---------------------------------");
			System.out.println("Уведіть нормальну відповідь");
		}
	}
}