package com.algonquin.library;

/**
 * This class is a factory for Public Library
 */
public class ConcretePubLibFactor implements LibraryFactoryInterface {

    /**
     * @return LibraryInterface
     */
    @Override
    public LibraryInterface createLibrary() {
        return new PublicLibrary();
    }
}
