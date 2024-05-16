    package Model;

    public class Cliente {
        private String responsavel;
        private int qtdPessoas;

        public Cliente(String responsavel, int qtdPessoas) {
            this.responsavel = responsavel;
            this.qtdPessoas = qtdPessoas;
        }

        public String getResponsavel() {
            return responsavel;
        }

        public void setResponsavel(String responsavel) {
            this.responsavel = responsavel;
        }

        public int getQtdPessoas() {
            return qtdPessoas;
        }

        public void setQtdPessoas(int qtdPessoas) {
            this.qtdPessoas = qtdPessoas;
        }

        

        
    }
