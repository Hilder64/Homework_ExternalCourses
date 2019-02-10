package task_2_game;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    Instant startTime;
    Instant endTime;
    Duration duration;
    boolean isRunning = false;

    public void start() {
        if (isRunning) {
            throw new RuntimeException("Stopwatch is already running.");
        }
        isRunning = true;
        startTime = Instant.now();
    }

    public Duration stop() {
        endTime = Instant.now();
        if (!isRunning) {
            throw new RuntimeException("Stopwatch has not been started yet");
        }
        isRunning = false;
        Duration result = Duration.between(startTime, endTime);
        if (duration == null) {
            duration = result;
        } else {
            this.duration = duration.plus(result);
        }

        return getElapsedTime();
    }

    public Duration getElapsedTime() {
        return duration;
    }

    public void reset() {
        if (isRunning) {
            stop();
        }
        duration = null;
    }
}
