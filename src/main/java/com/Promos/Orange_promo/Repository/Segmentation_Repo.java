package com.Promos.Orange_promo.Repository;


import com.Promos.Orange_promo.Entity.Segmentation;
import com.Promos.Orange_promo.Entity.SegmentationId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface Segmentation_Repo extends CrudRepository<Segmentation, SegmentationId> {
    @Query("SELECT s FROM Segmentation s WHERE s.id.msisdn = :msisdn")
    ArrayList<Segmentation> findByMsisdn(Long msisdn);
    ArrayList<Segmentation> findByOfferId(Long offerId);

}
