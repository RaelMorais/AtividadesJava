class Cliente{
        private String nome;
        private String email;

        public Cliente(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public void mostrarDados() {
            System.out.println("Cliente: " + nome);
            System.out.println("Email: " + email);
        }
}
    
