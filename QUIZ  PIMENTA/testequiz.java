package codigos;

import java.util.Scanner;

public class testequiz {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        cabecalho cabecalho0 = new cabecalho();
        System.out.println("----------------------------------------------------------------------------------------");

        cabecalho0.faculdade = "Faculdade: UNIFAN";
        cabecalho0.nome = "Nome: Paulo Henrique Andrade Chaveiro";
        cabecalho0.materia = "Matéria: Algoritmo e Programação II";
        cabecalho0.professor = "Professor: Brenno Pimenta";
        cabecalho0.escrevaCabecalho();
        System.out.println("-----------------------------------------------------------------------------------------");


        int acertos = 0;

        questoes questoes1 = new questoes();

        questoes1.pergunta = "1) Qual filme detém o recorde de maior bilheteria da história?";
        questoes1.opcaoA = "A) Titanic";
        questoes1.opcaoB = "B) Vingadores:Ultimato";
        questoes1.opcaoC = "C) Avatar";
        questoes1.opcaoD = "D) ...E o vento levou";
        questoes1.opcaoE = "E) Homen-Aranha:Sem Volta Para Casa";
        questoes1.escrevaQuestoes();
        questoes1.correta = "c";
        System.out.println("Digite a resposta correta");
        String resposta = leia.nextLine();
        if (resposta.equals(questoes1.iscorreta(resposta))) {
        } else {
        }
        if (resposta.equals(questoes1.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes2 = new questoes();

        questoes2.pergunta = "2) Qual desses filmes pertence a dreamworks?";
        questoes2.opcaoA = "A) Os incríveis";
        questoes2.opcaoB = "B) Up altas aventuras";
        questoes2.opcaoC = "C) As aventuras de ichabod e sr.sapo";
        questoes2.opcaoD = "D) Capitão cueca";
        questoes2.opcaoE = "E) Star wars";
        questoes2.escrevaQuestoes();
        questoes2.correta = "d";
        System.out.println("Digite a resposta correta");
        String resposta2 = leia.nextLine();
        if (resposta.equals(questoes2.iscorreta(resposta2))) {
        } else {
        }
        if (resposta.equals(questoes2.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");


        questoes questoes3 = new questoes();

        questoes3.pergunta = "3) Qual destes prêmios NÃO é considerado um dos QUATRO GRANDES do cinema americano (EGOT)?";
        questoes3.opcaoA = "A) Oscar (Academy Award)";
        questoes3.opcaoB = "B) Emmy";
        questoes3.opcaoC = "C) Globo de Ouro";
        questoes3.opcaoD = "D) Grammy";
        questoes3.opcaoE = "E) Tony";
        questoes3.escrevaQuestoes();
        questoes3.correta = "c";
        System.out.println("Digite a resposta correta");
        String resposta3 = leia.nextLine();
        if (resposta.equals(questoes3.iscorreta(resposta3))) {
        } else {
        }
        if (resposta.equals(questoes3.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes4 = new questoes();

        questoes4.pergunta = "4) O que significa a sigla \"CGI\", amplamente utilizada na produção de filmes modernos?";
        questoes4.opcaoA = "A) Computer Generated Imagery";
        questoes4.opcaoB = "B) Creative Graphic Interface";
        questoes4.opcaoC = "C) Cinematic General Imaging";
        questoes4.opcaoD = "D) Character Generation Input";
        questoes4.opcaoE = "E) Computer Graphic Illusion";
        questoes4.escrevaQuestoes();
        questoes4.correta = "a";
        System.out.println("Digite a resposta correta");
        String resposta4 = leia.nextLine();
        if (resposta.equals(questoes4.iscorreta(resposta4))) {
        } else {
        }
        if (resposta.equals(questoes4.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes5 = new questoes();

        questoes5.pergunta = "5) Qual destes filmes é amplamente creditado por popularizar o conceito de \"blockbuster\" de verão?";
        questoes5.opcaoA = "A) Star Wars: Uma Nova Esperança (1977)";
        questoes5.opcaoB = "B) Tubarão (1975)";
        questoes5.opcaoC = "C) E.T. o Extraterrestre (1982)";
        questoes5.opcaoD = "D) Os Caçadores da Arca Perdida (1981)";
        questoes5.opcaoE = "E) Jurassic Park";
        questoes5.escrevaQuestoes();
        questoes5.correta = "b";
        System.out.println("Digite a resposta correta");
        String resposta5 = leia.nextLine();
        if (resposta.equals(questoes5.iscorreta(resposta5))) {
        } else {
        }
        if (resposta.equals(questoes5.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes6 = new questoes();

        questoes6.pergunta = "6) Qual é o nome da técnica de edição que consiste em unir duas cenas diferentes, mas que ocorrem simultaneamente, para criar suspense?";
        questoes6.opcaoA = "A) Flashback";
        questoes6.opcaoB = "B) Montagem Paralela";
        questoes6.opcaoC = "C) Plano-Sequência";
        questoes6.opcaoD = "D) Zoom In";
        questoes6.opcaoE = "E) Voice-Over";
        questoes6.escrevaQuestoes();
        questoes6.correta = "b";
        System.out.println("Digite a resposta correta");
        String resposta6 = leia.nextLine();
        if (resposta.equals(questoes6.iscorreta(resposta6))) {
        } else {
        }
        if (resposta.equals(questoes6.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes7 = new questoes();

        questoes7.pergunta = "7) O que define um filme do gênero \"Film Noir\"?";
        questoes7.opcaoA = "A) Histórias de amor romântico e finais felizes";
        questoes7.opcaoB = "B) Comédias pastelão e humor físico";
        questoes7.opcaoC = "C) Temáticas sombrias, protagonistas cínicos e iluminação de alto contraste";
        questoes7.opcaoD = "D) Narrativas épicas em ambientes históricos ou fantásticos";
        questoes7.opcaoE = "E) Filmes musicais com grandes produções de dança";
        questoes7.escrevaQuestoes();
        questoes7.correta = "c";
        System.out.println("Digite a resposta correta");
        String resposta7 = leia.nextLine();
        if (resposta.equals(questoes7.iscorreta(resposta7))) {
        } else {
        }
        if (resposta.equals(questoes7.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes8 = new questoes();

        questoes8.pergunta = "8) Qual é o nome da empresa de produção cinematográfica fundada por Walt Disney?";
        questoes8.opcaoA = "A) Warner Bros";
        questoes8.opcaoB = "B) Pixar";
        questoes8.opcaoC = "C) Metro-Goldwyn-Mayer (MGM)";
        questoes8.opcaoD = "D) The Walt Disney Company";
        questoes8.opcaoE = "E) Universal Pictures";
        questoes8.escrevaQuestoes();
        questoes8.correta = "d";
        System.out.println("Digite a resposta correta");
        String resposta8 = leia.nextLine();
        if (resposta.equals(questoes8.iscorreta(resposta8))) {
        } else {
        }
        if (resposta.equals(questoes8.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes9 = new questoes();

        questoes9.pergunta = "9) Qual destes artistas detém o recorde de maior número de Oscars conquistados em categorias de atuação?";
        questoes9.opcaoA = "A) Meryl Streep";
        questoes9.opcaoB = "B) Jack Nicholson";
        questoes9.opcaoC = "C) Katharine Hepburn";
        questoes9.opcaoD = "D) Daniel Day-Lewis";
        questoes9.opcaoE = "E) Walter Brennan";
        questoes9.escrevaQuestoes();
        questoes9.correta = "c";
        System.out.println("Digite a resposta correta");
        String resposta9 = leia.nextLine();
        if (resposta.equals(questoes9.iscorreta(resposta9))) {
        } else {
        }
        if (resposta.equals(questoes9.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes10 = new questoes();

        questoes10.pergunta = "10) Qual diretor é conhecido por filmes como \"2001: Uma Odisseia no Espaço\" e \"Laranja Mecânica\"?";
        questoes10.opcaoA = "A) Alfred Hitchcock";
        questoes10.opcaoB = "B) Steven Spielberg";
        questoes10.opcaoC = "C) Stanley Kubrick";
        questoes10.opcaoD = "D) Quentin Tarantino";
        questoes10.opcaoE = "E) Martin Scorsese";
        questoes10.escrevaQuestoes();
        questoes10.correta = "c";
        System.out.println("Digite a resposta correta");
        String resposta10 = leia.nextLine();
        if (resposta.equals(questoes10.iscorreta(resposta10))) {
        } else {
        }
        if (resposta.equals(questoes10.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes11 = new questoes();

        questoes11.pergunta = "11) Qual foi o primeiro filme animado a ser indicado ao Oscar de Melhor Filme?";
        questoes11.opcaoA = "A) Rei Leão";
        questoes11.opcaoB = "B) Toy Story";
        questoes11.opcaoC = "C) A Bela e a Fera";
        questoes11.opcaoD = "D) Shrek";
        questoes11.opcaoE = "E) carros";
        questoes11.escrevaQuestoes();
        questoes11.correta = "c";
        System.out.println("Digite a resposta correta");
        String resposta11 = leia.nextLine();
        if (resposta.equals(questoes11.iscorreta(resposta11))) {
        } else {
        }
        if (resposta.equals(questoes11.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes12 = new questoes();

        questoes12.pergunta = "12) Qual foi o primeiro filme estrangeiro a ganhar o Oscar de Melhor Filme?";
        questoes12.opcaoA = "A) A Vida é Bela";
        questoes12.opcaoB = "B) Roma";
        questoes12.opcaoC = "C) A Pele que Habito";
        questoes12.opcaoD = "D) O Tigre e o Dragão";
        questoes12.opcaoE = "E) Parasita";
        questoes12.escrevaQuestoes();
        questoes12.correta = "e";
        System.out.println("Digite a resposta correta");
        String resposta12 = leia.nextLine();
        if (resposta.equals(questoes12.iscorreta(resposta12))) {
        } else {
        }
        if (resposta.equals(questoes12.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes13 = new questoes();

        questoes13.pergunta = "13) Qual diretor brasileiro é internacionalmente conhecido por filmes como \"Cidade de Deus\" (2002) e \"Ensaio sobre a Cegueira\" (2008)?";
        questoes13.opcaoA = "A) Héctor Babenco";
        questoes13.opcaoB = "B) Fernando Meirelles";
        questoes13.opcaoC = "C) José Padilha";
        questoes13.opcaoD = "D) Kleber Mendonça Filho";
        questoes13.opcaoE = "E) Cacá Diegues";
        questoes13.escrevaQuestoes();
        questoes13.correta = "b";
        System.out.println("Digite a resposta correta");
        String resposta13 = leia.nextLine();
        if (resposta.equals(questoes13.iscorreta(resposta13))) {
        } else {
        }
        if (resposta.equals(questoes13.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes14 = new questoes();

        questoes14.pergunta = "14) Qual filme do Studio Ghibli é o único a ter vencido o Oscar de Melhor Filme de Animação e o Urso de Ouro no Festival de Berlim?";
        questoes14.opcaoA = "A) Meu Amigo Totoro";
        questoes14.opcaoB = "B) Princesa Mononoke";
        questoes14.opcaoC = "C) O Castelo Animado";
        questoes14.opcaoD = "D) A Viagem de Chihiro";
        questoes14.opcaoE = "E) Túmulo dos Vagalumes";
        questoes14.escrevaQuestoes();
        questoes14.correta = "d";
        System.out.println("Digite a resposta correta");
        String resposta14 = leia.nextLine();
        if (resposta.equals(questoes14.iscorreta(resposta14))) {
        } else {
        }
        if (resposta.equals(questoes14.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        questoes questoes15 = new questoes();

        questoes15.pergunta = "15) Qual destes filmes ocupa consistentemente o primeiro lugar na lista dos 250 melhores do site IMDb, com a nota mais alta?";
        questoes15.opcaoA = "A) O Poderoso Chefão";
        questoes15.opcaoB = "B) A Lista de Schindler";
        questoes15.opcaoC = "C) Um Sonho de Liberdade";
        questoes15.opcaoD = "D) O Cavaleiro das Trevas";
        questoes15.opcaoE = "E) Pulp Fiction: Tempo de Violência";
        questoes15.escrevaQuestoes();
        questoes15.correta = "c";
        System.out.println("Digite a resposta correta");
        String resposta15 = leia.nextLine();
        if (resposta.equals(questoes15.iscorreta(resposta15))) {
        } else {
        }
        if (resposta.equals(questoes15.correta)){
            acertos = acertos + 1;
            System.out.println("Acertos:" + acertos);
        } else {
            System.out.println("Acertos:" + acertos);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
