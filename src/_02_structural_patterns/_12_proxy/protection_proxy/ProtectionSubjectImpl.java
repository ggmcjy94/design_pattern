package _02_structural_patterns._12_proxy.protection_proxy;

public class ProtectionSubjectImpl implements ProtectionInterface{
    private String name;

    public ProtectionSubjectImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
