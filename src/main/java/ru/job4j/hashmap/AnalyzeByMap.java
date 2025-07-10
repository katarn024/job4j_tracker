package ru.job4j.hashmap;

import java.util.*;
import java.util.function.BiFunction;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double result = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                result += subject.score();
                count++;
            }
        }
        return result / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        double score;
        int count = 0;
        for (Pupil pupil : pupils) {
            score = 0;
            count = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
            result.add(new Label(pupil.name(), score / count));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> dict = new LinkedHashMap<>();
        List<Label> result = new ArrayList<>();
        int countPupil = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                dict.merge(subject.name(), subject.score(), Integer::sum);
            }
            countPupil++;
        }
        for (String key : dict.keySet()) {
            result.add(new Label(key, dict.get(key) / countPupil));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        double score;
        for (Pupil pupil : pupils) {
            score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            result.add(new Label(pupil.name(), score));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> dict = new LinkedHashMap<>();
        List<Label> result = new ArrayList<>();

        //BiFunction<Integer, Integer, Integer> function = (oldValue, newValue) -> oldValue + newValue;
        BiFunction<Integer, Integer, Integer> function = Integer::sum;  //  равноценно верхей строчке

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                dict.merge(subject.name(), subject.score(), function);
                //dict.put(subject.name(), dict.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        for (String key : dict.keySet()) {
            result.add(new Label(key, dict.get(key)));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }
}