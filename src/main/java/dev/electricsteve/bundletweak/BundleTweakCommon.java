package dev.electricsteve.bundletweak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BundleTweakCommon {
    /**This logger is used to write text to the console and the log file.
     * It is considered best practice to use your mod id as the logger's name.
     * That way, it's clear which mod wrote info, warnings, and errors.
     */
    public static final Logger LOGGER = LoggerFactory.getLogger("bundletweak");
    public static final String VERSION = /*$ mod_version*/ "0.1.0";
    public static final String MINECRAFT = /*$ minecraft*/ "26.1";

//    /**
//     * Adapts to the {@link Identifier} changes introduced in 1.21.
//     */
//    public static Identifier id(String namespace, String path) {
//        //? if <1.21 {
//        /*return new Identifier(namespace, path);
//         *///?} else
//        return Identifier.fromNamespaceAndPath(namespace, path);
//    }
}
