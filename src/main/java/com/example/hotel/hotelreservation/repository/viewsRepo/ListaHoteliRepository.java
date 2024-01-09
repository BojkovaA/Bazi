package com.example.hotel.hotelreservation.repository.viewsRepo;

import com.example.hotel.hotelreservation.model.views.ListaHoteli;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListaHoteliRepository extends JpaRepository<ListaHoteli, String> {
//    @Query(value="SELECT * FROM  lista_hoteli", nativeQuery = true)
//    List<ListaHoteli> findByCityName(@Param("city") String city);

    @Query(value = "SELECT * FROM lista_hoteli ", nativeQuery = true)
    List<ListaHoteli> findAllListaHoteli();

    @Query(value = "SELECT * FROM lista_hoteli WHERE city_name = :city", nativeQuery = true)
    List<ListaHoteli> findAllListaHoteliByCity(@Param("city") String city);

}
