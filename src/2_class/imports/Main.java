package 2_class.imports;

import 2_class.imports.iran.*;
import 2_class.imports.america.America;
import 2_class.imports.america.Test;

public class Main {
    public static void main(String[] args) {
        ///////////////////////// import
        Iran iran = new Iran();
        iran.a();
        America america = new America();
        america.a();
        // در قسمت امپورت کردن از پکیج ایران پکیج های زیر شاخه امپورت نمی شوند و باید به طور جدا گانه امپورت شوند.
        2_class.imports.iran.tehran.Test test1 = new 2_class.imports.iran.tehran.Test();
        Test test = new Test();
        test.a();
    }
}
