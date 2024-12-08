public class NamePattern {
    public static void main(String[] args) {
        String[] names = {
                "SHIFA","U","V","R","ARIFA","JAHID","I","MAHIN","U","NAMIR","ZILAN","I","HASAN","A","NOYON","JAMEU","A","MONIR","A","LITON","I","M","I","MAMUN","A","N","Y","A","SIAM","A","R","G","H","O", "S","A","G","A","R"
        };


        String[][] pattern = new String[10][100];

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                pattern[i][j] = " ";
            }
        }

        pattern[0][0] = names[0];//SHIFA
        pattern[1][0] = names[1];//U
        pattern[2][0] = names[2];//V
        pattern[3][0] = names[3];//R
        pattern[4][0] = names[4];//ARIFA

        pattern[0][3] = names[5];//JAHID
        pattern[1][7] = names[6];//I
        pattern[2][7] = names[7];//MAHIN
        pattern[3][11] = names[8];//U
        pattern[4][3] = names[9];//NAMIR

        pattern[0][8] = names[10];//ZILAN
        pattern[1][16] = names[11];//I
        pattern[2][12] = names[12];//HASAN
        pattern[3][16] = names[13];//A
        pattern[4][8] = names[14];//NOYON

        pattern[0][16] = names[15];//JAMEU
        pattern[1][28] = names[16];//A
        pattern[2][20] = names[17];//MONIR
        pattern[3][28] = names[18];//A
        pattern[4][16] = names[19];//LITON
        pattern[3][32] = names[20];//I

        pattern[0][20] = names[21];//M
        pattern[1][36] = names[22];//I
        pattern[2][24] = names[23];//MAMUN
        pattern[0][24] = names[24];//A
        pattern[1][40] = names[25];//N
        pattern[3][40] = names[26];//Y
        pattern[4][24] = names[27];//A

        pattern[4][28] = names[28];//SIAM

        pattern[0][36] = names[29];//A
        pattern[1][52] = names[30];//R
        pattern[2][36] = names[31];//G
        pattern[3][52] = names[32];//H
        pattern[4][33] = names[33];//O
        pattern[0][41] = names[34];//S
        pattern[1][56] = names[35];//A
        pattern[2][38] = names[36];//G
        pattern[3][56] = names[37];//A
        pattern[4][38] = names[38];//R


        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}
