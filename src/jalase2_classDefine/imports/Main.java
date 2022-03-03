package jalase2_classDefine.imports;

import jalase2_classDefine.imports.iran.*;
import jalase2_classDefine.imports.america.America;
import jalase2_classDefine.imports.america.Test;

public class Main {
    public static void main(String[] args) {
        ///////////////////////// import
        Iran iran = new Iran();
        iran.a();
        America america = new America();
        america.a();
        // در قسمت امپورت کردن از پکیج ایران پکیج های زیر شاخه امپورت نمی شوند و باید به طور جدا گانه امپورت شوند.
        jalase2_classDefine.imports.iran.tehran.Test test1 = new jalase2_classDefine.imports.iran.tehran.Test();
        Test test = new Test();
        test.a();
    }
}
