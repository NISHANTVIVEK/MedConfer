package com.Medconfer.dtos;

import java.util.List;

public class HospitalDto {
	public Long hospitalID;
	public List<DoctorDto> doctorDtos;
	
	public Long getHospitalID() {
		return hospitalID;
	}
	public void setHospitalID(Long hospitalID) {
		this.hospitalID = hospitalID;
	}
	public List<DoctorDto> getDoctorDtos() {
		return doctorDtos;
	}
	public void setDoctorDtos(List<DoctorDto> doctorDtos) {
		this.doctorDtos = doctorDtos;
	}
}
