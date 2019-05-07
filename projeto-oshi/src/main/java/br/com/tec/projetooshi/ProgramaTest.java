/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tec.projetooshi;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.Sensors;
import oshi.software.os.OperatingSystem;

/**
 *
 * @author SVNTSTV
 */
public class ProgramaTest {

	public static void main(String[] args) {
		// instanciando objeto oshi do tipo Biblioteca
		Bibliotecas oshiTeste = new Bibliotecas();
		JSensorsLib jsensors = new JSensorsLib();
		// instanciando objeto si do tipo SystemInfo da biblioteca oshi

		SystemInfo si = new SystemInfo();

		HardwareAbstractionLayer hal = si.getHardware();
		OperatingSystem os = si.getOperatingSystem();
		CentralProcessor cp = hal.getProcessor();
		GlobalMemory memory = hal.getMemory();
		SensorsOshi sensorsOshi = new SensorsOshi();
		ProcessosOshi processosOshi = new ProcessosOshi();
		ComponenteHardware componenteHardware = new ComponenteHardware();

		componenteHardware.getNomeCPU();
		componenteHardware.getFamilyCPU();
		componenteHardware.getIdentifierCPU();
		componenteHardware.getLogicalProcessorCount();
		componenteHardware.getPhysicalProcessorCount();
		componenteHardware.getPhysicalPackageCount();
		componenteHardware.getModel();
		componenteHardware.getManufacturer();
		componenteHardware.getMemoriaTotal();
		componenteHardware.getMemoriaLivre();
//		sensorsOshi.sensors.getCpuTemperature();
//		sensorsOshi.sensors.getCpuVoltage();
//		sensorsOshi.sensors.getFanSpeeds();
//
//		processosOshi.quantidadeProcessos();
//		processosOshi.listProcessos(memory);
		// Sensors sensors = new Sensors() {
//			
//			@Override
//			public int[] getFanSpeeds() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//			
//			@Override
//			public double getCpuVoltage() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			@Override
//			public double getCpuTemperature() {
//				double teste = hal.getSensors().getCpuTemperature();
//				System.out.println(teste);
//				// TODO Auto-generated method stub
//				return teste;
//			}
//		};
//		
//		sensors.getCpuTemperature();

		// oshiTeste.printProcesses(os, memory);
		// oshiTeste.printProcessor(cp);
		// oshiTeste.printCpu(cp);
//		jsensors.testCpu();
//		jsensors.testeGpu();
//		jsensors.testeDisk();
//		jsensors.checkRights();
//		jsensors.printPowerShell();

	}
}
