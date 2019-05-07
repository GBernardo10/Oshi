package br.com.tec.projetooshi;

import java.util.Arrays;
import java.util.List;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystem.ProcessSort;
import oshi.util.FormatUtil;

public class ProcessosOshi {
	SystemInfo si = new SystemInfo();
	HardwareAbstractionLayer hal = si.getHardware();
	OperatingSystem os = si.getOperatingSystem();

	public void quantidadeProcessos() {
		System.out.println("\n Processos: " + os.getProcessCount() 
		+ "\n Threads: " + os.getThreadCount());
	}

	public void listProcessos(GlobalMemory memory) {
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

}
