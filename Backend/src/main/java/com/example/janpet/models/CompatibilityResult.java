package com.example.janpet.models;

public class CompatibilityResult {

    private boolean isCompatible;
    private String compatibilityMessage;

    public CompatibilityResult() {
        // Construtor vazio
    }

    public CompatibilityResult(boolean isCompatible, String compatibilityMessage) {
        this.isCompatible = isCompatible;
        this.compatibilityMessage = compatibilityMessage;
    }

    public boolean isCompatible() {
        return isCompatible;
    }

    public void setCompatible(boolean compatible) {
        isCompatible = compatible;
    }

    public String getCompatibilityMessage() {
        return compatibilityMessage;
    }

    public void setCompatibilityMessage(String compatibilityMessage) {
        this.compatibilityMessage = compatibilityMessage;
    }
}

