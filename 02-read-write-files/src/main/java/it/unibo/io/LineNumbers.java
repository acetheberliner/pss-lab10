package it.unibo.io;

import java.io.File;
import java.io.IOException;

/**
 * Simple utility class that adds line numbers to files.
 */
public final class LineNumbers {

    private LineNumbers() { }

    /**
     * Processes the provided file produces a new file where each line is prefixed with its line number
     * (starting from 1).
     * The new file must have the same name of the original one, prefixed with {@code numbered-}.
     * For instance,
     * <ul>
     *     <li>{@code myfile.txt} should become {@code numbered-myfile.txt}</li>
     *     <li>{@code pluto.dat} should become {@code numbered-pluto.dat}</li>
     * </ul>
     *
     * @param file the file on which the function should operate
     */
    public static void addLineNumbersToTextFile(final File file) throws IOException {
    }
}
