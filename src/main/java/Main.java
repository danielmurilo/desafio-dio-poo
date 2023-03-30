import br.com.dio.dominio.Curso;

public class Main {

    public static void main(String[] args) {

        var curso = new Curso();
        curso.setTitulo("ADS");
        curso.setDescricao("Análise e Desenvolvimento de Sistemas");
        curso.setCargaHoraria(1400);
        System.out.println(curso);

    }
}
