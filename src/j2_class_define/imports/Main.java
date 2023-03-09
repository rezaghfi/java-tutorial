package j2_class_define.imports;

import j2_class_define.imports.iran.*;
import j2_class_define.imports.america.America;
import j2_class_define.imports.america.Test;

public class Main {
    public static void main(String[] args) {
        ///////////////////////// import
        Iran iran = new Iran();
        iran.a();
        America america = new America();
        america.a();
        // در قسمت امپورت کردن از پکیج ایران پکیج های زیر شاخه امپورت نمی شوند و باید به طور جدا گانه امپورت شوند.
        j2_class_define.imports.iran.tehran.Test test1 = new j2_class_define.imports.iran.tehran.Test();
        Test test = new Test();
        test.a();
        Test a =new Test();
    }
}
