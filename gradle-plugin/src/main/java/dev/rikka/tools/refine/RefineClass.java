package dev.rikka.tools.refine;

import java.util.Map;

public class RefineClass {
    private final String originalClassName;
    private final String replacedClassName;
    private final Map<String, String> memberReplacement;

    public RefineClass(String originalClassName, String replacedClassName, Map<String, String> memberReplacement) {
        this.originalClassName = originalClassName;
        this.replacedClassName = replacedClassName;
        this.memberReplacement = memberReplacement;
    }

    public String getOriginalClassName() {
        return originalClassName;
    }

    public String getReplacedClassName() {
        return replacedClassName;
    }

    public Map<String, String> getMemberReplacement() {
        return memberReplacement;
    }

    @Override
    public String toString() {
        return "RefineClass{" +
                "originalClassName='" + originalClassName + '\'' +
                ", replacedClassName='" + replacedClassName + '\'' +
                ", memberReplacement=" + memberReplacement +
                '}';
    }
}