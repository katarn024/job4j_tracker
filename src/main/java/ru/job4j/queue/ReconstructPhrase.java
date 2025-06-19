package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder result = new StringBuilder("");
        int evenElementsSize = evenElements.size();
        for (int index = 0; index < evenElementsSize / 2; index++) {
            result.append(evenElements.pollFirst());
            evenElements.pollFirst();
        }
        return result.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder("");
        int descendingElementsSize = descendingElements.size();
        for (int index = 0; index < descendingElementsSize; index++) {
            result.append(descendingElements.pollLast());
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
