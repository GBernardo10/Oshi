/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tec.projetooshi;

import com.profesorfalken.jsensors.model.components.Components;
import com.profesorfalken.jsensors.model.components.Cpu;
import com.profesorfalken.jsensors.model.components.Gpu;
import com.profesorfalken.jsensors.model.sensors.Fan;
import com.profesorfalken.jsensors.model.sensors.Temperature;
import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jpowershell.PowerShell;
import com.profesorfalken.jpowershell.PowerShellResponse;
import com.profesorfalken.jsensors.manager.SensorsManager;
import com.profesorfalken.jsensors.manager.windows.powershell.PowerShellOperations;
import com.profesorfalken.jsensors.model.components.Disk;
import com.profesorfalken.jsensors.util.OSDetector;

import java.util.List;

/**
 *
 * @author SVNTSTV
 */
public class JSensorsLib {

    SensorsManager sensorsManager = new SensorsManager() {
        @Override
        protected String getSensorsData() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
//
//    public static void checkRights() {
//        if (OSDetector.isWindows() && !PowerShellOperations.isAdministrator()) {
//            System.out.println("You have not executed jSensors in Administrator mode, so CPU temperature sensors will not be detected.");
//        }
//    }
    //  PowerShell ps = PowerShell.openSession;
//   PowerShell.openSession ()
//    .executeCommandAndChain("Get-Process", (res -> System.out.println("List Processes:" + res.getCommandOutput())))
//              .executeCommandAndChain("Get-WmiObject Win32_BIOS", (res -> System.out.println("BIOS information:" + res.getCommandOutput())))
//              .close();
    public void printPowerShell() {
        PowerShellResponse response = PowerShell.executeSingleCommand("Get-process");
        System.out.println("List process: " + response.getCommandOutput());
    }
    Components components = JSensors.get.components();

//   PowerShell.openSession()
//              .executeCommandAndChain("Get-Process", (res -> System.out.println("List Processes:" + res.getCommandOutput())))
//              .executeCommandAndChain("Get-WmiObject Win32_BIOS", (res -> System.out.println("BIOS information:" + res.getCommandOutput())))
//              .close();
    public void testeGpu() {

        List<Gpu> gpus = components.gpus;
        if (gpus != null) {
            for (final Gpu gpu : gpus) {
                System.out.println("Found CPU component: " + gpu.name);
                if (gpu.sensors != null) {
                    System.out.println("Sensors: ");

                    //Print temperatures
                    List<Temperature> temps = gpu.sensors.temperatures;
                    for (final Temperature temp : temps) {
                        System.out.println(temp.name + ": " + temp.value + " C");
                    }

                    //Print fan speed
                    List<Fan> fans = gpu.sensors.fans;
                    for (final Fan fan : fans) {
                        System.out.println(fan.name + ": " + fan.value + " RPM");
                    }
                }
            }
        }
    }

    public void testCpu() {
        List<Cpu> cpus = components.cpus;
        if (cpus != null) {
            for (final Cpu cpu : cpus) {
                System.out.println("Found CPU component: " + cpu.name);
                if (cpu.sensors != null) {
                    System.out.println("Sensors: ");

                    //Print temperatures
                    List<Temperature> temps = cpu.sensors.temperatures;
                    for (final Temperature temp : temps) {
                        System.out.println(temp.name + ": " + temp.value + " C");
                    }

                    //Print fan speed
                    List<Fan> fans = cpu.sensors.fans;
                    for (final Fan fan : fans) {
                        System.out.println(fan.name + ": " + fan.value + " RPM");
                    }
                }
            }
        }
    }

    public void testeDisk() {
        List<Disk> disks = components.disks;
        if (disks != null) {
            for (final Disk disk : disks) {
                System.out.println("Found CPU component: " + disk.name);
                if (disk.sensors != null) {
                    System.out.println("Sensors: ");

                    //Print temperatures
                    List<Temperature> temps = disk.sensors.temperatures;
                    for (final Temperature temp : temps) {
                        System.out.println(temp.name + ": " + temp.value + " C");
                    }

                    //Print fan speed
                    List<Fan> fans = disk.sensors.fans;
                    for (final Fan fan : fans) {
                        System.out.println(fan.name + ": " + fan.value + " RPM");
                    }
                }
            }
        }
    }

    public void checkRights() {
        if (OSDetector.isWindows() && !PowerShellOperations.isAdministrator()) {
            System.out.println("You have not executed jSensors in Administrator mode, so CPU temperature sensors will not be detected.");
        }
    }

}
