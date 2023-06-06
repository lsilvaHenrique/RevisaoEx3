package main;

public class Principal {
    public static void main(String[] args) {
        String phoneNumber = "11986587100"; // Exemplo de número de telefone
        
        int position = hashPhoneNumber(phoneNumber);
        
        System.out.println("Número de telefone: " + phoneNumber);
        System.out.println("Posição no vetor: " + position);
    }
    
    public static int hashPhoneNumber(String phoneNumber) {
        // Verificar se o número de telefone está no formato correto
        if (phoneNumber.length() != 11) {
            throw new IllegalArgumentException("Formato de número de telefone inválido. Deve ser XXNNNNNNNNN.");
        }
        
        // Extrair o DDD e o número de celular
        String ddd = phoneNumber.substring(0, 2);
        String cellNumber = phoneNumber.substring(2);
        
        // Converter o DDD em um inteiro
        int dddInt = Integer.parseInt(ddd);
        
        // Converter o número de celular em um long
        long cellNumberLong = Long.parseLong(cellNumber);
        
        // Calcular a posição no vetor
        int position = 11 + ((dddInt + (int) (cellNumberLong % 89)) % 89);
        
        return position;
    }
}


