package edu.aitu.filesystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/** Add the required T1-T8 tests from the assignment specification. */
class VisitorTest {
    @Test
    void fileAcceptDispatchesToFileVisitMethod() {
        FileNode file = new FileNode("notes.txt", 12);
        final boolean[] called = {false};

        file.accept(new Visitor() {
            @Override
            public void visit(FileNode visited) {
                called[0] = true;
            }

            @Override
            public void visit(DirectoryNode directory) {
                fail("A file must dispatch to visit(FileNode)");
            }
        });

        assertTrue(called[0]);
    }
}