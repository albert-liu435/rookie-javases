package com.rookie.bigdata.spi;

import org.junit.jupiter.api.Test;
import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;


/**
 * @Class SPIServiceTest
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/5 16:10
 * @Version 1.0
 */
public class SPIServiceTest {

    @Test
    public void print() {
        ServiceLoader<SPIService> serviceLoader = ServiceLoader.load(SPIService.class);
        SPIService spiService = null;
        for (SPIService service : serviceLoader) {

            service.print("SPI");
        }
    }


    @Test
    public void print2() {


        Iterator<SPIService> providers = Service.providers(SPIService.class);
        ServiceLoader<SPIService> load = ServiceLoader.load(SPIService.class);

        while (providers.hasNext()) {
            SPIService ser = providers.next();
            ser.print("SPI");
        }
        System.out.println("--------------------------------");
        Iterator<SPIService> iterator = load.iterator();
        while (iterator.hasNext()) {
            SPIService ser = iterator.next();
            ser.print("SPI");
        }
    }

}