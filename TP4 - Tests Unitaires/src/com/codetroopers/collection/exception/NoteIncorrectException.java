package com.codetroopers.collection.exception;

public class NoteIncorrectException extends Exception {

    public static enum NatureException {
        NEGATIVE,
        SUPERIEUR_A_20,
        INCONNUE
    }

    private final NatureException natureException;

    public NoteIncorrectException(Double note) {
        if (note < 0) {
            natureException = NatureException.NEGATIVE;
        } else if (note > 20) {
            natureException = NatureException.SUPERIEUR_A_20;
        } else {
            natureException = NatureException.INCONNUE;
        }
    }

    public NatureException getNatureException() {
        return natureException;
    }
}
