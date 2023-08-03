package com.Promos.Orange_promo.BSL;
import com.Promos.Orange_promo.Entity.Segmentation;
import com.Promos.Orange_promo.Entity.SegmentationId;
import com.Promos.Orange_promo.Repository.Segmentation_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Segmentation_Service {

    private static Segmentation_Repo segmentation= null;

    @Autowired
    public Segmentation_Service(Segmentation_Repo segmentationRepo) {
        segmentation = segmentationRepo;
    }


    public Segmentation SaveSegmentation(Segmentation seg){
        return segmentation.save(seg);
    }


    public ArrayList<Segmentation> findSegmentationByMsisdn(Long Mis) {
        return segmentation.findByMsisdn(Mis);
    }

    public ArrayList<Segmentation> findSegmentationByOfferId(Long OfferId) {
        return segmentation.findByOfferId(OfferId);
    }

    public void deleteSegmentationById(SegmentationId segmentationId) {
        segmentation.deleteById(segmentationId);
    }


}
