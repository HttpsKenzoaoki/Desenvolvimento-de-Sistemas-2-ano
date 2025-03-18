package Produto;

public class Produto {
    private int Id;
    private String Nome;
    private String Preco;
    private String Tipo;
    private String Funcao;
   
    public Produto(){ //! Construtor Padrão (Sem parametros)
        this.Id = 0;
        this.Nome = "";
        this.Preco = "";
        this.Funcao = "";
        this.Tipo = "";
    } //? Permite criar um produto vazio e definir os valores depois usando os setters. 
   //? Útil quando você não tem todas as informações no momento da criação do objeto. 

    public Produto(int Id, String Nome, String Preco){ //* Construtor com ID, Nome e Preço */
        this.Id = Id;
        this.Nome = Nome;
        this.Preco = Preco;
        this.Tipo = "Não definido";
        this.Funcao = "Não definido";
    } //? Permite cadastrar um produto sem precisar definir Tipo e Função no momento.
      //? Evita obrigar o usuário a preencher informações que podem ser desconhecidas no início.
     //? Define valores padrão ("Não definido") para os campos opcionais.

    public Produto(int Id, String Nome, String Tipo, String Funcao, String Preco){ //! Construtor completo
        this.Nome = Nome;
        this.Id = Id;
        this.Preco = Preco;
        this.Tipo = Tipo;
        this.Funcao = Funcao;
        
    }

    public int getId(){
        return Id;
    }

    public String getNome(){
        return Nome;
    }

    public String getTipo(){
        return Tipo;
    }

    public String getFuncao(){
        return Funcao;
    }

    public String getPreco(){
        return Preco;
    }

    public void setId(int Id){
        this.Id = Id;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public void SetTipo(String Tipo){
        this.Tipo = Tipo;
    }

    public void SetFunção(String Funcao){
        this.Funcao = Funcao;
    }

    public void setPreço(String Preco){
        this.Preco = Preco;
    }
    public void exibirProduto() { //! Função pra exibir o Produto
        System.out.println("\nID: " + Id);
        System.out.println("Nome: " + Nome);
        System.out.println("Tipo: " + Tipo);
        System.out.println("Função: " + Funcao);
        System.out.println("Preço: R$" + Preco);
    }
}

                                                //*  Feito Por Kenzo Aoki, 2- DS(AMS) *//