package dev.practice.order.domain.partner;

public interface PartnerService {
    PartnerInfo registerPartnerInfo(PartnerCommand command);
    PartnerInfo getPartnerInfo(String partnerToken);
    PartnerInfo enablePartner(String partnerToken);
    PartnerInfo disablePartner(String partnerToken);
}
