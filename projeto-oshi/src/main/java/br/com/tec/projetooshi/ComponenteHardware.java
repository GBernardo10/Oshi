package br.com.tec.projetooshi;

import java.util.List;

import oshi.SystemInfo;
import oshi.hardware.Baseboard;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.Firmware;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HWPartition;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;

public class ComponenteHardware {
	private SystemInfo si = new SystemInfo();
	private OperatingSystem os = si.getOperatingSystem();
	private HardwareAbstractionLayer hal = si.getHardware();
	private CentralProcessor cp = hal.getProcessor();
	private ComputerSystem cs = hal.getComputerSystem();
	private GlobalMemory gm = hal.getMemory();
	private HWDiskStore diskStore = new HWDiskStore();
	private Baseboard bs = cs.getBaseboard();
	private Firmware fm = cs.getFirmware();

	private String nomeCPU;
	private String familyCPU;
	private String identifierCPU;
	private int qtdProcessadorLogico;
	private int qtdProcessadorFisicoPack;
	private int qtdProcessadorFisico;
	private String modeloCPU;
	private String fabricante;
	private long memoriaTotal;
	private long memoriaLivre;
	private HWDiskStore[] nomeDiscoHD;
	private String modeloDiscoHD;
	private long tamanhoDiscoHD;
	private String fabricanteBaseboard;
	private String modeloBaseboard;
	private String numeroSerialBaseboard;
	private String versaoBaseboard;
	private String nomeFirmware;
	private String descricaoFirmware;
	private String fabricanteFirmware;
	private String versaoFirmware;
	private String dataLancamentoFirmware;

	public ComponenteHardware() {

		this.memoriaLivre = memoriaLivre;
		this.nomeDiscoHD = nomeDiscoHD;
		this.modeloDiscoHD = modeloDiscoHD;
		this.tamanhoDiscoHD = tamanhoDiscoHD;
		this.fabricanteBaseboard = fabricanteBaseboard;
		this.modeloBaseboard = modeloBaseboard;
		this.numeroSerialBaseboard = numeroSerialBaseboard;
		this.versaoBaseboard = versaoBaseboard;
		this.nomeFirmware = nomeFirmware;
		this.descricaoFirmware = descricaoFirmware;
		this.fabricanteFirmware = fabricanteFirmware;
		this.versaoFirmware = versaoFirmware;
		this.dataLancamentoFirmware = dataLancamentoFirmware;
	}

	/* --------------nomeCPU----------------- */
	private String nomeCPU(String nomeCPU) {
		this.nomeCPU = nomeCPU;
		return nomeCPU;
	}

	public void getNomeCPU() {
		System.out.println(nomeCPU(cp.getName()));
	}

	/* -------------------------------------- */

	/* --------------familyCPU--------------- */

	private String familyCPU(String familyCPU) {
		this.familyCPU = familyCPU;
		return familyCPU;
	}

	public void getFamilyCPU() {
		System.out.println(familyCPU(cp.getFamily()));
	}
	/* -------------------------------------- */

	/* --------------identifierCPU----------- */

	private String identifierCPU(String identifierCPU) {
		this.identifierCPU = identifierCPU;
		return identifierCPU;
	}

	public void getIdentifierCPU() {
		System.out.println(identifierCPU(cp.getIdentifier()));
	}
	/* -------------------------------------- */

	/* --------------qtdProcessadorLogico----------- */

	private int qtdProcessadorLogico(int qtdProcessadorLogico) {
		this.qtdProcessadorLogico = qtdProcessadorLogico;
		return qtdProcessadorLogico;
	}

	public void getLogicalProcessorCount() {
		System.out.println(qtdProcessadorLogico(cp.getLogicalProcessorCount()));
	}

	/* -------------------------------------- */

	/* --------------qtdProcessadorFisico----------- */

	private int qtdProcessadorFisico(int qtdProcessadorFisico) {
		this.qtdProcessadorFisico = qtdProcessadorFisico;
		return qtdProcessadorFisico;
	}

	public void getPhysicalProcessorCount() {
		System.out.println(qtdProcessadorFisico(cp.getPhysicalProcessorCount()));
	}

	/* -------------------------------------- */

	/* --------------qtdProcessadorFisicoPack----------- */

	private int qtdProcessadorFisicoPack(int qtdProcessadorFisicoPack) {
		this.qtdProcessadorFisicoPack = qtdProcessadorFisicoPack;
		return qtdProcessadorFisicoPack;
	}

	public void getPhysicalPackageCount() {
		System.out.println(qtdProcessadorFisicoPack(cp.getPhysicalPackageCount()));
	}

	/* -------------------------------------- */

	/* --------------modeloCPU----------- */

	private String modeloCPU(String modeloCPU) {
		this.modeloCPU = modeloCPU;
		return modeloCPU;
	}

	public void getModel() {
		System.out.println(modeloCPU(cp.getModel()));
	}

	/* -------------------------------------- */

	/* --------------fabricante----------- */

	private String fabricante(String fabricante) {
		this.fabricante = fabricante;
		return fabricante;
	}

	public void getManufacturer() {
		System.out.println(fabricante(cs.getManufacturer()));
	}

	/* -------------------------------------- */

	/* --------------memoriaTotal----------- */

	private long memoriaTotal(long memoriaTotal) {
		this.memoriaTotal = memoriaTotal;
		return memoriaTotal;
	}

	public void getMemoriaTotal() {
		System.out.println(FormatUtil.formatBytes(memoriaTotal(gm.getTotal())));
	}

	/* -------------------------------------- */

	/* --------------memoriaLivre----------- */

	private long memoriaLivre(long memoriaLivre) {
		this.memoriaLivre = memoriaLivre;
		return memoriaLivre;
	}

	public void getMemoriaLivre() {
		System.out.println(FormatUtil.formatBytes(memoriaLivre(gm.getAvailable())));
	}

	/* -------------------------------------- */

	/* --------------nomeDiscoHD----------- */

//	private HWDiskStore[] nomeDiscoHD(HWDiskStore[] diskStores) {
//		this.nomeDiscoHD = diskStores;
//		return diskStores;
//	}
	
	
	public void testeDis() {
		diskStore.getSize();
	}

//	private HWDiskStore[] disk(HWDiskStore[] nomeDiscoHD) {
//		this.nomeDiscoHD = nomeDiscoHD;
//		return nomeDiscoHD;
//	}
//
//	public String testeDois() {
//		System.out.println(disk(diskStore.getName()));
//		return diskStore.getName();
//	}
//
//	private String disk(String name) {
//		testeDois();
//		return testeDois();
//		// TODO Auto-generated method stub
//	}

//	public ComponenteHardware(HWDiskStore[] diskStore) {
//		this.diskStore = diskStore;
//
//	}

//	public void getNameHD() {
//		System.out.println(diskStore.);
//		
//	}

	/* -------------------------------------- */

	public void teste() {

//		diskStore.getName();
//		diskStore.getModel();
//		diskStore.getSize();
		bs.getManufacturer();
		bs.getModel();
		bs.getSerialNumber();
		bs.getVersion();
		fm.getName();
		fm.getDescription();
		fm.getManufacturer();
		fm.getVersion();
		fm.getReleaseDate();

	}

}
