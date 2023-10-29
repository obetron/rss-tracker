package com.gelecex.upwork.rsstracker.exception;

/**
 * @author obetron
 * @date 29.10.2023 - 18:27
 */
public class RssTrackerException extends Exception {

    public RssTrackerException() {
        super();
    }

    public RssTrackerException(String message) {
        super(message);
    }

    public RssTrackerException(String message, Throwable cause) {
        super(message, cause);
    }

    public RssTrackerException(Throwable cause) {
        super(cause);
    }

    protected RssTrackerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
