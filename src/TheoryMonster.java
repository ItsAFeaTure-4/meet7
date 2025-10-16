import java.util.Scanner;
public class TheoryMonster extends Monster {
    private String image = "\uD83E\uDD13";
    TheoryMonster(int sizeBoard) {
        super(sizeBoard);
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean taskMonster(int difficultGame) {
        System.out.println("Монстр-теоретик говорит, сейчас проверим твои знания ");
        System.out.println("Отвечай на вопрос ! ");
        String [][] questions = {
                {"Сколько байт занимает тип int в Java ? (введи число)", "4"},
                {"Какой оператор используется для сравнения примитивы ? (== или equals)", "=="},
                {"Может ли класс наследоваться от нескольких классов в Java? (да/нет)", "нет"},
                {"Как называется механизм управления памятью в Java? (сборка мусора/чистка памяти)", "сборка мусора"},
                {"Какой модификатор доступа самый строгий? (public/private/protected)", "private"}
        };


        int randomIndex = r.nextInt(questions.length);
        String question = questions[randomIndex][0];
        String correctAnswer = questions[randomIndex][1];
        System.out.println("❓ " + question );
        System.out.println("Твой ответ");

        Scanner scanner = new Scanner(System.in);
        String usserAnswer = scanner.nextLine();
        if (usserAnswer.equals(correctAnswer)) {
            System.out.println("Отлично ты отлично разбираешься в теории !");
            return true;
        }
        else {
            System.out.println("Ошибочка попробуй еще раз");
        }
        return false;

    }
}
