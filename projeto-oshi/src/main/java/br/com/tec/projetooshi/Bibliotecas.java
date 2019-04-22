/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//  OperatingSystem osTeste = new OperatingSystem();
//  HardwareAbstractionLayer hardwareTeste = new AbstractHardwareAbstractionLayer();
//  HardwareAbstractionLayer getHardwareTeste = new HardwareAbstractionLayer();
//  CentralProcessor getProcessorTeste = new CentralProcessor();
package br.com.tec.projetooshi;


import java.util.Arrays;
import java.util.List;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystem.ProcessSort;
import oshi.util.FormatUtil;

/**
 *
 * @author SVNTSTV
 */
public class Bibliotecas {

    // importando OSHI
//    SystemInfo si = new SystemInfo();
//    HardwareAbstractionLayer hal = si.getHardware();
//    OperatingSystem os = si.getOperatingSystem();
//    CentralProcessor cp = hal.getProcessor();
//    GlobalMemory memory = hal.getMemory();

    public static void printProcesses(OperatingSystem os, GlobalMemory memory) {
        System.out.println("Processses: " + os.getProcessCount());
        List<OSProcess> procs = Arrays.asList(os.getProcesses(5, ProcessSort.CPU));

        System.out.println("   PID  %CPU %MEM       VSZ       RSS Name");
        for (int i = 0; i < procs.size() && i < 5; i++) {
            OSProcess p = procs.get(i);
            System.out.format(" %5d %5.1f %4.1f %9s %9s %s%n", p.getProcessID(),
                    100d * (p.getKernelTime() + p.getUserTime()) / p.getUpTime(),
                    100d * p.getResidentSetSize() / memory.getTotal(), FormatUtil.formatBytes(p.getVirtualSize()),
                    FormatUtil.formatBytes(p.getResidentSetSize()), p.getName());
        }
    }

    public static void printProcessor(CentralProcessor processor) {
        System.out.println(processor.getName());
    }

    public static void printCpu(CentralProcessor processor) {
        System.out.println(FormatUtil.formatElapsedSecs(processor.getSystemUptime()));
        System.out.println(processor.getContextSwitches() + " / " + processor.getInterrupts());
        StringBuilder procCpu = new StringBuilder("CPU load per processor:");
        double[] load = processor.getProcessorCpuLoadBetweenTicks();
        for (double avg : load) {
            procCpu.append(String.format(" %.1f%%", avg * 100));
        }
        System.out.println(procCpu.toString());

    }
}

// int pro;
/*  
    public void processos(){
        this.pro = sistemaOperacional.getProcessId();
        System.out.println(sistemaOperacional.getProcessId());
    }

    HardwareAbstractionLayer hardware = sistema.getHardware();
    CentralProcessor processador = hardware.getProcessor();
    public void processadorTeste() {
    System.out.println("Nome do processador: " + processador.getName());
    }
     
    public Bibliotecas() {
        this.pro = sistemaOperacional.getProcessId();
    }
 */
