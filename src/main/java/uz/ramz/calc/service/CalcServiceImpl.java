package uz.ramz.calc.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService{

    @Override
    public double calc1(double aaa, double bbb, double ccc, double ddd, double eee, double fff) {
        return aaa*bbb*ccc*ddd/(eee*fff);
    }

    @Override
    public double calc2(double aaa, double bbb) {
        return Math.sqrt(aaa*bbb);
    }

    @Override
    public double calc3(double aaa, double bbb, double ccc) {
        return Math.pow(10,-9)*aaa*Math.pow(bbb,ccc);
    }

    @Override
    public double calc4(double aaa, double bbb) {
        return 4*aaa/(3.1415*Math.pow(bbb,2));
    }

    @Override
    public double calc5(double aaa, double bbb, double ccc, double ddd, double eee, double fff, double ggg, double hhh) {
        return 0.0203*(Math.pow(aaa,2)*Math.pow(bbb,2)*(6*ccc-bbb)*ddd)*Math.sqrt(Math.pow(eee,3)*fff)*ggg/(Math.pow(ccc,3)*Math.sqrt(hhh));
    }

    @Override
    public double calc55(double aaa, double bbb, double ccc, double ddd, double eee, double fff, double ggg, double hhh) {
        return 0.0203*(Math.pow(aaa,2)*Math.pow(bbb,2)*(6*ccc-bbb)*ddd)*Math.sqrt(Math.pow(eee,3)*fff)*ggg/(Math.pow(ccc,3)*Math.sqrt(hhh));
    }

    @Override
    public double calc6(double aaa, double bbb) {
        return (3*Math.pow((aaa*bbb-Math.pow(bbb,2)),0.5))/aaa + 4*Math.pow((bbb/aaa), 0.5);
    }

    @Override
    public double calc7(double aaa, double bbb) {
        return aaa*bbb;
    }

    @Override
    public double calc8(double aaa, double bbb, double ccc, double ddd, double eee, double fff) {
        return aaa*bbb*ccc/(ddd*eee*fff);
    }

    @Override
    public double calc9(double aaa, double bbb, double ccc, double ddd, double eee, double fff, double ggg, double hhh, double iii) {
        return 1.22*aaa*bbb*ccc*(6*ddd-ccc)*eee*fff/(Math.pow(ddd,2)*ggg*hhh*iii);
    }

    @Override
    public double calc99(double aaa, double bbb, double ccc, double ddd, double eee, double fff, double ggg, double hhh, double iii) {
        return 1.22*aaa*bbb*ccc*(6*ddd-ccc)*eee*fff/(Math.pow(ddd,2)*ggg*hhh*iii);
    }
}
