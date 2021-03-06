package com.alberto.aawebapifamilias.service;

import com.alberto.aawebapifamilias.domain.Familiar;
import com.alberto.aawebapifamilias.domain.Residente;
import com.alberto.aawebapifamilias.exception.FamiliarNotFoundException;

import java.util.List;

public interface FamiliarService {

  Familiar addFamiliar(Familiar familiar);

  Familiar findFamiliar(long id) throws FamiliarNotFoundException;

  List<Familiar> findAllFamiliares();

  List<Familiar> findAllFamiliares(long id);

  Familiar removeFamiliar(long id) throws FamiliarNotFoundException;

  Familiar modifyFamiliar(long id, Familiar familiar) throws FamiliarNotFoundException;

    void addRelacion(Residente residente, Familiar familiar);

  Familiar patchfamiliar(long id, String telefono)throws FamiliarNotFoundException;

  //Familiar addFamiliar(FamiliarDto familiarDto);
}
