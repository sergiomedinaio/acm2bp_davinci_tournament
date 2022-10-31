import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        Date comienzoDeCursada = new Date(2022, 7, 18);
        Date finDeCursada = new Date(2022, 11, 5);
        Date fechaParcial = new Date(2022, 8, 29);

        Season torneoDaVinci = new Season(
            "Torneo 2022, 2do cuatri",
            comienzoDeCursada,
            finDeCursada
        );

        Team profesPoo = new Team("Profes POO");
        profesPoo.addPlayer(new Player("profe Poo", "Goalkeeper"));
        profesPoo.addPlayer(new Player("profe ux", "Defender"));
        profesPoo.addPlayer(new Player("profe pw1", "Middle"));
        profesPoo.addPlayer(new Player("profe pw1", "Striker"));
        profesPoo.addPlayer(new Player("profe adp", "Winger"));

        Team estudiantesPoo = new Team("Estudiantes POO");
        estudiantesPoo.addPlayer(new Player("Estudiante Poo", "Goalkeeper"));
        estudiantesPoo.addPlayer(new Player("Estudiante ux", "Defender"));
        estudiantesPoo.addPlayer(new Player("Estudiante pw1", "Middle"));
        estudiantesPoo.addPlayer(new Player("Estudiante pw1", "Striker"));
        estudiantesPoo.addPlayer(new Player("Estudiante adp", "Winger"));


        Match primerParcial = new Match(
            "Aula 116",
            fechaParcial,
            profesPoo,
            estudiantesPoo
        );

        System.out.println(primerParcial.generateMarker());
        primerParcial.makeGoal(profesPoo, profesPoo.getPlayers().get(0));
        System.out.println(primerParcial.generateMarker());

    }
}
