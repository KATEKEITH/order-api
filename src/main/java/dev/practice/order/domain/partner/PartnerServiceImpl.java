package dev.practice.order.domain.partner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PartnerServiceImpl implements  PartnerService{

    @Override
    public PartnerInfo registerPartnerInfo(PartnerCommand command) {
        var initPartner= Partner.builder()
                .partnerName(command.getPartnerName())
                .businessNo(command.getBusinessNo())
                .email(command.getEmail())
                .build();


        Partner partner = partnerStore.store(initPartner);


        return PartnerInfo.builder()
                .id(partner.getId())
                .partnerName(partner.get)
                .partnerToken(partner.getPartnerToken())
                .businessNo(partner.getBusinessNo())
                .email(partner.getEmail())
                .status(partner.getStatus())
                .build();
    }

    @Override
    public PartnerInfo getPartnerInfo(String partnerToken) {
        return null;
    }

    @Override
    public PartnerInfo enablePartner(String partnerToken) {
        return null;
    }

    @Override
    public PartnerInfo disablePartner(String partnerToken) {
        return null;
    }
}
