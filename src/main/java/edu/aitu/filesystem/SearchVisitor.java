package edu.aitu.filesystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/** Finds files matching a name condition and an inclusive minimum size. */
public class SearchVisitor implements Visitor {
    private final Predicate<String> nameCondition;
    private final long minimumSize;
    private final List<String> matches = new ArrayList<>();

    public SearchVisitor(Predicate<String> nameCondition, long minimumSize) {
        if (nameCondition == null || minimumSize < 0) {
            throw new IllegalArgumentException("Invalid search configuration");
        }
        this.nameCondition = nameCondition;
        this.minimumSize = minimumSize;
    }

    public List<String> getMatches() {
        return Collections.unmodifiableList(matches);
    }

    @Override
    public void visit(FileNode file) {
        // TODO: apply both conditions and store the root-relative path.
    }

    @Override
    public void visit(DirectoryNode directory) {
        // TODO: traverse children in deterministic order while tracking paths.
    }
}