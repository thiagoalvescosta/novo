package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("Class1DAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Class1DAO extends JpaRepository<Class1, java.lang.String> {

  /**
   * Obtém a instância de Class1 utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Class1 entity WHERE entity.id = :id")
  public Class1 findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Class1 utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Class1 entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



}
