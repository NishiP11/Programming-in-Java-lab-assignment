import java.util.Arrays;

public class AminoacidSort {
    public static void main(String[] args) {

        String[] amino_acids = {"glycine","aspartic acid","valine","tyrosine","cysteine","histidine","isoleucine","proline","phenylalanine"};

        Arrays.sort(amino_acids);

        System.out.println("Sorted amino acids: \n");

        int i;
        for(i = 0; i < amino_acids.length; i++){
            System.out.println(amino_acids[i]);
        }

    }
}
