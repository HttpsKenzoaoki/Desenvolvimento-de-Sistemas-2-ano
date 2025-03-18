import java.util.Scanner;
import Produto.Produto;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args ) throws InterruptedException { //*  Esse throws InterruptedException é para o tempo funcionar, no caso o delay
        Scanner scanner = new Scanner(System.in);
        ArrayList <Produto> listaProdutos = new ArrayList<>();
        int op;
        do{ //! O Do vai fazer ele repetir!!
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Criar Produto");
            System.out.println("2 - Alterar os dados de um produto");
            System.out.println("3 - Excluir um produto");
            System.out.println("4 - Listar todos os produtos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
         op = scanner.nextInt();
         scanner.nextLine();
        switch (op) {
            case 1:
               
            System.out.print("Digite o ID do produto:");
            int ID = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o Nome do produto:");
            String Nome = scanner.nextLine();

            System.out.print("Digite o Preço do produto: ");
            String Preco = scanner.nextLine();
        
            char Escolha;
        do{ 

        
            System.out.print("Deseja definir o Tipo e Função agora? (Y/N):"); 
            Escolha = scanner.next().charAt(0);
            scanner.nextLine();

            if (Escolha != 'Y' && Escolha != 'y' && Escolha != 'N' && Escolha != 'n') { //! Vai verificar se a pessoa escolheu Y ou N
                System.out.println("Opção inválida! Digite 'Y' para sim ou 'N' para não.");

        }
    }  while (Escolha != 'Y' && Escolha != 'y' && Escolha != 'N' && Escolha != 'n'); //! Ele vai repetir o comando de cima até tiver tudo certo, ai ele vai pra proxima etapa
            
                Produto novoProduto = null;

                if (Escolha == 'Y' || Escolha == 'y') { //? Se for Y, A pessoa vai ter que colocar a função e o Tipo
                    System.out.print("Digite o Tipo do produto:");
                    String Tipo = scanner.nextLine();
                    System.out.print("Digite a função do produto:");
                    String funcao = scanner.nextLine();

                    novoProduto = new Produto(ID, Nome, Tipo, funcao, Preco); //! Vai Cadastrar como Novo produto
                }

                if(Escolha == 'n' || Escolha == 'N') { //! Verifica se a pessoa escolheu N
                    novoProduto = new Produto(ID, Nome, Preco); //? Vai cadastrar sem função e Tipo
                }
                    listaProdutos.add(novoProduto); //! Adiciona a lista de Produtos/arrays
                    System.out.print("Produto Cadastrado com sucesso!!");

                Thread.sleep(1000); //*Ele vai dar um tempo de 1 segundo, para mostrar a opção de dar enter para voltar no menu!! 
                System.out.println("\nPressione Enter para voltar ao menu...");
                scanner.nextLine();
                break;


            case 2:
            if (listaProdutos.isEmpty()) { //! Verifica se a lista está Vazia
                System.out.print("Não há nenhum produto");
                Thread.sleep(1000);
                System.out.println("\nPressione Enter para voltar ao menu...");
                scanner.nextLine();
                break;
            }


            System.out.print("Digite O ID do produto");
            int IdBuscador = scanner.nextInt();
            scanner.nextLine();

            Produto produtoEncontrado = null;
            for(Produto P : listaProdutos){ //! Vai ficar Procurando o ID do Produto
                if (P.getId() == IdBuscador) {
                    produtoEncontrado = P; //! Caso ele Encontre vai ficar na variavel produtoEncontrado
                    break;
                }
            }

            if (produtoEncontrado == null) {
               System.out.print("Produto não encontrado!");  //! Se ele não achar, ele vai retornar pro Menu
               break;
            }

            System.out.print("Produto Encontrado!!");
            produtoEncontrado.exibirProduto(); //! Vai mostrar o Produto, pra pessoa verificar se é o produto certo

            System.out.print("\nNovo nome (ou pressione ENTER para manter): ");
            String novoNome = scanner.nextLine();
            if (!novoNome.isEmpty()) {
                produtoEncontrado.setNome(novoNome);
            }
    
            System.out.print("Novo preço (ou pressione ENTER para manter): ");
            String novoPreco = scanner.nextLine();
            if (!novoPreco.isEmpty()) {
                produtoEncontrado.setPreço(novoPreco);
            }
    
            System.out.print("Novo tipo (ou pressione ENTER para manter): ");
            String novoTipo = scanner.nextLine();
            if (!novoTipo.isEmpty()) {
                produtoEncontrado.SetTipo(novoTipo);
            }
    
            System.out.print("Nova função (ou pressione ENTER para manter): ");
            String novaFuncao = scanner.nextLine();
            if (!novaFuncao.isEmpty()) {
                produtoEncontrado.SetFunção(novaFuncao);
            }
    
            System.out.println("Produto atualizado com sucesso!");

            Thread.sleep(1000); //*Ele vai dar um tempo de 1 segundo, para mostrar a opção de dar enter para voltar no menu!! 
            System.out.println("\nPressione Enter para voltar ao menu...");
            scanner.nextLine();
            break;

            case 3:
            if (listaProdutos.isEmpty()) {  //! Verifica se a lista está Vazia
                System.out.print("Não há nenhum produto");
                Thread.sleep(1000);
                System.out.println("\nPressione Enter para voltar ao menu...");
                scanner.nextLine();
                break;
            }

            System.out.print("Digite o ID do produto que você quer excluir:");
            IdBuscador = scanner.nextInt();
            produtoEncontrado = null;
            for(Produto P : listaProdutos){ //! Vai ficar Procurando o ID do Produto
                if (P.getId() == IdBuscador) {
                    produtoEncontrado = P;
                    break;
                }
            }

            if (produtoEncontrado == null) {
               System.out.print("Produto não encontrado!"); //! Caso ele não ache
               break;
            }

            System.out.print("Produto Encontrado!!");
            produtoEncontrado.exibirProduto(); //! Vai exibir o produto, pra pessoa ter certeza que é esse mesmo que ela quer excluir

            System.out.print("Você tem certeza que quer excluir esse produto? (Y/N)");
            char Confirmação = scanner.next().charAt(0);

            if (Confirmação == 'Y' || Confirmação == 'y') { //! Caso a pessoa escolher Y, ele vai excluir da lista
                listaProdutos.remove(produtoEncontrado);
                System.out.print("Produto excluido com sucesso!!");
                Thread.sleep(1000); //*Ele vai dar um tempo de 1 segundo, para mostrar a opção de dar enter para voltar no menu!! 
                System.out.println("\nPressione Enter para voltar ao menu...");
                scanner.nextLine();
                break;
            }

            else{
                System.out.print("Operação Cancelada!"); //! Caso a pessoa digitar outra coisa, ai ele cancela e não exclui, apenas volta pro menu
                Thread.sleep(1000); //*Ele vai dar um tempo de 1 segundo, para mostrar a opção de dar enter para voltar no menu!!
                System.out.println("\nPressione Enter para voltar ao menu...");
                scanner.nextLine();
                break;
            }

            case 4:
            if (listaProdutos.isEmpty()) {
                System.out.print("Não há nenhum produto"); //! Caso não tenha produto na lista
                Thread.sleep(1000); //*Ele vai dar um tempo de 1 segundo, para mostrar a opção de dar enter para voltar no menu!!
                System.out.println("\nPressione Enter para voltar ao menu...");
                scanner.nextLine();
                break;
            }

            System.out.println("\n=== Lista de Produtos ===");
            for(Produto p:listaProdutos){ //! Vai mostrar todos os produtos da lista 
                p.exibirProduto();
            }

            Thread.sleep(1000); //*Ele vai dar um tempo de 1 segundo, para mostrar a opção de dar enter para voltar no menu!! 
            System.out.println("\nPressione Enter para voltar ao menu...");
            scanner.nextLine();
            break;

            case 5:
                System.out.println("Saindo...."); 
                break;

            default:
            System.out.println("Opção inválida! Tente novamente.");
        }

    } while(op != 5); //! O While vai repetir o menu, até a opção for igual a 5!!
        scanner.close(); //! Importante sempre fechar o scanner
    }
}

                                                //*  Feito Por Kenzo Aoki, 2- DS(AMS) *//