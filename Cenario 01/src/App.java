import br.edu.up.Models.Livro;

public class App {
    public static void main(String[] args)  {
        // Livro 01
        Livro livroUm = new Livro();

        livroUm.setCodigo("1598FHK");
        livroUm.setTitulo("Core Java 2");
        livroUm.setAutores("Cay S. Horstmann", "Gary Cornell");
        livroUm.setIsbn("0130819336");
        livroUm.setAno(2005);

        System.out.println("Código: "+livroUm.getCodigo());
        System.out.println("Título: "+ livroUm.getTitulo());
        System.out.println("Autores: ");
        for (String autores : livroUm.getAutores()) {
            System.out.print(" - " + autores);
        }
        System.out.println();
        System.out.println("ISBN: " + livroUm.getIsbn());
        System.out.println("Ano: " + livroUm.getAno());

        //Livro 02

        Livro livroDois = new Livro();

        livroDois.setCodigo("9865PLO");
        livroDois.setTitulo("Java, How to Program");
        livroDois.setAutores("Harvey Deitel");
        livroDois.setIsbn("0130341517");
        livroDois.setAno(2015);

        System.out.println("Código: "+livroUm.getCodigo());
        System.out.println("Título: "+ livroUm.getTitulo());
        System.out.println("Autores: ");
        for (String autores : livroUm.getAutores()) {
            System.out.print(" - " + autores);
        }
        System.out.println();
        System.out.println("ISBN: " + livroUm.getIsbn());
        System.out.println("Ano: " + livroUm.getAno());
    }
}
