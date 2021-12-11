package bai_Tap_Them.bai1.controler;


import bai_Tap_Them.bai1.model.Candidate;
import bai_Tap_Them.bai1.service.CandidateService;
import bai_Tap_Them.bai1.service.CandidateServiceIMP;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        CandidateService candidates = new CandidateServiceIMP();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter contestant number:");
        int size = Integer.parseInt(input.nextLine());
        Candidate[] candidateArray = new Candidate[size];
        for (Candidate candidate:candidateArray){
            candidate = new Candidate();
            candidates.inputValue(candidate);
            candidates.checkCandiScore(candidate);
        }

    }


}
