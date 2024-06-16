package com.algonquin.library;

/**
 * This class is a factory for Academic Library
 */
public class ConcreteAcLibFactor implements LibraryFactoryInterface {

    /**
     * @return LibraryInterface
     */
    @Override
    public LibraryInterface createLibrary() {
        return new AcademicLibrary();
    }
}
