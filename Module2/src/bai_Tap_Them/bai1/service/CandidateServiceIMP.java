package bai_Tap_Them.bai1.service;

import bai_Tap_Them.bai1.model.Candidate;

import java.util.Scanner;

public class CandidateServiceIMP implements CandidateService{


    @Override
    public void inputValue(Candidate candidate) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter index of Candidate:");
        int indexOf = Integer.parseInt(input.nextLine());
        candidate.setCoded(indexOf);
        System.out.print("Enter name:");
        String name = input.nextLine().trim();
        candidate.setName(name);
        System.out.print("Enter Day Of Birth:");
        String dayOfBirth = input.nextLine().trim();
        candidate.setDayOfBirth(dayOfBirth);
        System.out.print("Enter math score:");
        int mathScore = Integer.parseInt(input.nextLine());
        candidate.setScoreMath(mathScore);
        System.out.print("Enter literature score:");
        int lightsScore = Integer.parseInt(input.nextLine());
        candidate.setScoreLiterature(lightsScore);
        System.out.print("Enter english score:");
        int englishScore = Integer.parseInt(input.nextLine());
        candidate.setScoreEnglish(englishScore);
    }

    @Override
    public void checkCandiScore(Candidate candidate) {
        if (candidate.getScoreEnglish()+ candidate.getScoreMath()+ candidate.getScoreLiterature()>15){
            System.out.println(candidate);
        }else {
            System.out.println("no contestant over fifteen point");
        }
    }
}
