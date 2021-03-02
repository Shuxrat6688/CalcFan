package uz.ramz.calc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.ramz.calc.service.CalcService;


@RestController
public class MyRestController {

    private final CalcService service;

    public MyRestController(CalcService service) {
        this.service = service;
    }

    @GetMapping("calc1")
    public double calc1(@RequestParam double aaa, @RequestParam double bbb, @RequestParam double ccc,
                        @RequestParam double ddd, @RequestParam double eee, @RequestParam double fff) {
        return service.calc1(aaa,bbb,ccc,ddd,eee,fff);
    }

    @GetMapping("calc2")
    public double calc2(@RequestParam double aaa, @RequestParam double bbb) {
        return service.calc2(aaa,bbb);
    }

    @GetMapping("calc3")
    public double calc3(@RequestParam double aaa, @RequestParam double bbb, @RequestParam double ccc) {
        return service.calc3(aaa,bbb,ccc);
    }

    @GetMapping("calc4")
    public double calc4(@RequestParam double aaa, @RequestParam double bbb) {
        return service.calc4(aaa,bbb);
    }

    @GetMapping("calc5")
    public double calc5(@RequestParam double aaa, @RequestParam double bbb, @RequestParam double ccc,
                        @RequestParam double ddd, @RequestParam double eee, @RequestParam double fff,
                        @RequestParam double ggg, @RequestParam double hhh) {
        return service.calc5(aaa,bbb,ccc,ddd,eee,fff,ggg,hhh);
    }

    @GetMapping("calc55")
    public double calc55(@RequestParam double aaa, @RequestParam double bbb, @RequestParam double ccc,
                        @RequestParam double ddd, @RequestParam double eee, @RequestParam double fff,
                        @RequestParam double ggg, @RequestParam double hhh) {
        return service.calc55(aaa,bbb,ccc,ddd,eee,fff,ggg,hhh);
    }

    @GetMapping("calc6")
    public double calc6(@RequestParam double aaa, @RequestParam double bbb) {
        return service.calc6(aaa, bbb);
    }

    @GetMapping("calc7")
    public double calc7(@RequestParam double aaa, @RequestParam double bbb) {
        return service.calc7(aaa, bbb);
    }

    @GetMapping("calc8")
    public double calc8(@RequestParam double aaa, @RequestParam double bbb, @RequestParam double ccc,
                        @RequestParam double ddd, @RequestParam double eee, @RequestParam double fff) {
        return service.calc8(aaa,bbb,ccc,ddd,eee,fff);
    }

    @GetMapping("calc9")
    public double calc9(@RequestParam double aaa, @RequestParam double bbb, @RequestParam double ccc,
                         @RequestParam double ddd, @RequestParam double eee, @RequestParam double fff,
                         @RequestParam double ggg, @RequestParam double hhh, @RequestParam double iii) {
        return service.calc9(aaa,bbb,ccc,ddd,eee,fff,ggg,hhh,iii);
    }

    @GetMapping("calc99")
    public double calc99(@RequestParam double aaa, @RequestParam double bbb, @RequestParam double ccc,
                        @RequestParam double ddd, @RequestParam double eee, @RequestParam double fff,
                        @RequestParam double ggg, @RequestParam double hhh, @RequestParam double iii) {
        return service.calc99(aaa,bbb,ccc,ddd,eee,fff,ggg,hhh,iii);
    }

}
