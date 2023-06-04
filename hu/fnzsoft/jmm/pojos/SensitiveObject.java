package hu.fnzsoft.jmm.pojos;

public class SensitiveObject {

    private int secretCode;

    public SensitiveObject() {
    }

    public SensitiveObject(int secretCode) {
        this.secretCode = secretCode;
    }

    public int getSecretCode() {
        return secretCode;
    }
}
