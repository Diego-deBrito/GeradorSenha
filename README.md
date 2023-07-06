# GeradorSenha

<h2>Índice</h2>
<li><a href="#sobre">Sobre</a></li>
<li><a href="tec">Tecnologia</a></li>
<li><a href="comment">Comentários</a></li>

<h2 id="sobre">Sobre</h2>
<p>
  Um gerador de senhas aleatórias, feito para
  treinamento de logíca de programação e Java.
</p>


<h2 href="tec">Tecnologia</h2>
<li><a>Java</a></li>



<h2 id="comment">Comentários</h2>
<p>
  Aqui quero fazer alguns comentários sobre o desenvolvimento do projeto.
</p>




 # Este método é responsável por gerar uma senha aleatória,
// recebe um parâmetro 'tamanho' que determina o comprimento da senha a ser gerada.</a>

```
public static String geradorSenhas(int tamanho){

```

# A variável 'caracteres' contém todos os caracteres que podem ser usados na senha.</p>

```
  String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_-+=<>?{}";
```

# É criado um objeto StringBuilder chamado senha para construir gradualmente a senha.

```
  StringBuilder senha = new StringBuilder();
```

# Um objeto Random é criado para gerar números aleatórios.
```
  Random random = new Random();
```

#  loop for é executado tamanho vezes para adicionar caracteres aleatórios à senha.
```
  for (int i = 0; i < tamanho; i++) {
```

#  cada iteração do loop, um índice aleatório é gerado usando o método nextInt do objeto Random, e o caractere correspondente a esse índice é adicionado à senha usando o método append do StringBuilder.
```
      int indice = random.nextInt(caracteres.length());
      char caractere = caracteres.charAt(indice);
      senha.append(caractere);
```
# Após o loop, a senha é convertida para uma string usando o método toString do StringBuilder e é retornada.
   ```
      return senha.toString();
}
```
# Método imprimirSenha, Este método recebe uma senha como parâmetro e imprime a senha gerada no console.
```
  public static void imprimirSenha(String senha) {
      System.out.println("Senha gerada: " + senha);
```

# Este método é o ponto de entrada do programa.
```
public static void main(String[] args) {
```
# É criada uma variável tamanhoSenha, onde é declarado número de caracteres.
   ```
    int tamanhoSenha = 10;
   ```
# A função gerarSenha é chamada passando o tamanhoSenha como argumento, e a senha gerada é armazenada na variável senhaGerada.
   ```
    String senhaGerada = gerarSenha(tamanhoSenha);
  ```
# Em seguida, a função imprimirSenha é chamada passando a senhaGerada como argumento, exibindo a senha gerada no console.
    ```
    imprimirSenha(senhaGerada);
}
    ```





