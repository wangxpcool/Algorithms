package cn.me.test.stu2022.EnumTest;

public enum Em {

    VLE("s1","svvv"),
    VDFEF("s2","svvv"),
    ;
    private String key ;
    private String value;

    Em(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
