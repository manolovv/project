package architecture;
import java.util.*;

public final class DataHolder {
    private final static Map<BrandName, Brand> brands = new HashMap<>();
    private final static Map<ModelName, Model> models = new HashMap<>();

    static {
        /*brands.put(BrandName.ACURA, new Brand(BrandName.ACURA));
        brands.put(BrandName.AUDI, new Brand(BrandName.AUDI));
        brands.put(BrandName.ALFAROMEO, new Brand(BrandName.ALFAROMEO));
        brands.put(BrandName.ASTONMARTIN, new Brand(BrandName.ASTONMARTIN));
        brands.put(BrandName.BMW, new Brand(BrandName.BMW));
        brands.put(BrandName.BENTLEY, new Brand(BrandName.BENTLEY));
        brands.put(BrandName.BUGATTI, new Brand(BrandName.BUGATTI));
        brands.put(BrandName.CADILLAC, new Brand(BrandName.CADILLAC));
        brands.put(BrandName.CHEVROLET, new Brand(BrandName.CHEVROLET));
        brands.put(BrandName.CHRYSLER, new Brand(BrandName.CHRYSLER));
        brands.put(BrandName.CITROEN, new Brand(BrandName.CITROEN));
        brands.put(BrandName.DACIA, new Brand(BrandName.DACIA));
        brands.put(BrandName.DAEWOO, new Brand(BrandName.DAEWOO));
        brands.put(BrandName.DAIHATSU, new Brand(BrandName.DAIHATSU));
        brands.put(BrandName.DATSU, new Brand(BrandName.DATSU));
        brands.put(BrandName.DODGE, new Brand(BrandName.DODGE));
        brands.put(BrandName.FERRARI, new Brand(BrandName.FERRARI));
        brands.put(BrandName.FIAT, new Brand(BrandName.FIAT));
        brands.put(BrandName.FORD, new Brand(BrandName.FORD));
        brands.put(BrandName.GREATWALL, new Brand(BrandName.GREATWALL));
        brands.put(BrandName.HONDA, new Brand(BrandName.HONDA));
        brands.put(BrandName.HYUNDAI, new Brand(BrandName.HYUNDAI));
        brands.put(BrandName.INFINITI, new Brand(BrandName.INFINITI));
        brands.put(BrandName.ISUZU, new Brand(BrandName.ISUZU));
        brands.put(BrandName.JAGUAR, new Brand(BrandName.JAGUAR));
        brands.put(BrandName.KIA, new Brand(BrandName.KIA));
        brands.put(BrandName.LADA, new Brand(BrandName.LADA));
        brands.put(BrandName.LAMBORGHINI, new Brand(BrandName.JAGUAR));
        brands.put(BrandName.LANCIA, new Brand(BrandName.LANCIA));
        brands.put(BrandName.LEXUS, new Brand(BrandName.LEXUS));
        brands.put(BrandName.LINCOLN, new Brand(BrandName.LINCOLN));
        brands.put(BrandName.LOTUS, new Brand(BrandName.LOTUS));
        brands.put(BrandName.MERCEDES, new Brand(BrandName.MERCEDES));
        brands.put(BrandName.MASERATI, new Brand(BrandName.MASERATI));
        brands.put(BrandName.MAZDA, new Brand(BrandName.MAZDA));
        brands.put(BrandName.MINI, new Brand(BrandName.MINI));
        brands.put(BrandName.MITSUBISHI, new Brand(BrandName.MITSUBISHI));
        brands.put(BrandName.NISSAN, new Brand(BrandName.NISSAN));
        brands.put(BrandName.OPEL, new Brand(BrandName.OPEL));
        brands.put(BrandName.PEUGEOT, new Brand(BrandName.PEUGEOT));
        brands.put(BrandName.PORSCHE, new Brand(BrandName.PORSCHE));
        brands.put(BrandName.RENAULT, new Brand(BrandName.RENAULT));
        brands.put(BrandName.ROLLSROYCE, new Brand(BrandName.ROLLSROYCE));
        brands.put(BrandName.ROVER, new Brand(BrandName.ROVER));
        brands.put(BrandName.SUBARU, new Brand(BrandName.SUBARU));
        brands.put(BrandName.SEAT, new Brand(BrandName.SEAT));
        brands.put(BrandName.SAAB, new Brand(BrandName.SAAB));
        brands.put(BrandName.SKODA, new Brand(BrandName.SKODA));
        brands.put(BrandName.SMART, new Brand(BrandName.SMART));
        brands.put(BrandName.SSANGYONG, new Brand(BrandName.SSANGYONG));
        brands.put(BrandName.SUZUKI, new Brand(BrandName.SUZUKI));
        brands.put(BrandName.TESLA, new Brand(BrandName.TESLA));
        brands.put(BrandName.TOYOTA, new Brand(BrandName.TOYOTA));
        brands.put(BrandName.VOLKSWAGEN, new Brand(BrandName.VOLKSWAGEN));
        brands.put(BrandName.VOLVO, new Brand(BrandName.VOLVO));*/



        /*brands.get(BrandName.ACURA).addModel(getModelByName(BrandName.ACURA, ModelName.ACURA_TLX));
        brands.get(BrandName.ACURA).addModel(getModelByName(BrandName.ACURA, ModelName.ACURA_ILX));
        brands.get(BrandName.ACURA).addModel(getModelByName(BrandName.ACURA, ModelName.ACURA_INTEGRA));
        brands.get(BrandName.ACURA).addModel(getModelByName(BrandName.ACURA, ModelName.ACURA_MDX));
        brands.get(BrandName.ACURA).addModel(getModelByName(BrandName.ACURA, ModelName.ACURA_NSX));
        brands.get(BrandName.ACURA).addModel(getModelByName(BrandName.ACURA, ModelName.ACURA_RDX));
        brands.get(BrandName.ACURA).addModel(getModelByName(BrandName.ACURA, ModelName.ACURA_ZDX));
        brands.get(BrandName.ACURA).addModel(getModelByName(BrandName.ACURA, ModelName.ACURA_RLX));

        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_90));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_155));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_156));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_159));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_164));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_166));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_GIULLIA));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_GIULLIETTA));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_GT));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_MITO));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_SPIDER));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_STELVIO));
        brands.get(BrandName.ALFAROMEO).addModel(getModelByName(BrandName.ALFAROMEO, ModelName.ALFA_SPRINT));

        brands.get(BrandName.ASTONMARTIN).addModel(getModelByName(BrandName.ASTONMARTIN, ModelName.ASTON_DB7));
        brands.get(BrandName.ASTONMARTIN).addModel(getModelByName(BrandName.ASTONMARTIN, ModelName.ASTON_DB9));
        brands.get(BrandName.ASTONMARTIN).addModel(getModelByName(BrandName.ASTONMARTIN, ModelName.ASTON_DBS));
        brands.get(BrandName.ASTONMARTIN).addModel(getModelByName(BrandName.ASTONMARTIN, ModelName.ASTON_DBX));
        brands.get(BrandName.ASTONMARTIN).addModel(getModelByName(BrandName.ASTONMARTIN, ModelName.ASTON_RAPIDE));
        brands.get(BrandName.ASTONMARTIN).addModel(getModelByName(BrandName.ASTONMARTIN, ModelName.ASTON_VANQUISH));
        brands.get(BrandName.ASTONMARTIN).addModel(getModelByName(BrandName.ASTONMARTIN, ModelName.ASTON_V8_VANTAGE));
        brands.get(BrandName.ASTONMARTIN).addModel(getModelByName(BrandName.ASTONMARTIN, ModelName.ASTON_V12_VANTAGE));

        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A1));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_S1));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A2));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_S2));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A3));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_S3));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A4));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A4_ALLROAD));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_S4));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A5));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_S5));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_SQ5));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A6));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A6_ALLROAD));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_S6));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A7));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_S7));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_SQ7));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A8));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_S8));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_SQ8));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_Q2));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_Q3));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_Q4));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_Q5));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_Q7));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_Q8));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_RS3));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_RS4));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_RS5));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_RS6));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_RS7));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_RSQ3));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_RSQ8));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_TT));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_QUATTRO));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_R8));

        brands.get(BrandName.BENTLEY).addModel(getModelByName(BrandName.BENTLEY, ModelName.BENTLEY_ARNAGE));
        brands.get(BrandName.BENTLEY).addModel(getModelByName(BrandName.BENTLEY, ModelName.BENTLEY_AZURE));
        brands.get(BrandName.BENTLEY).addModel(getModelByName(BrandName.BENTLEY, ModelName.BENTLEY_BENTAYGA));
        brands.get(BrandName.BENTLEY).addModel(getModelByName(BrandName.BENTLEY, ModelName.BENTLEY_CONTINENTAL));
        brands.get(BrandName.BENTLEY).addModel(getModelByName(BrandName.BENTLEY, ModelName.BENTLEY_CONTINENTAL_GT));
        brands.get(BrandName.BENTLEY).addModel(getModelByName(BrandName.BENTLEY, ModelName.BENTLEY_GT_CONVERTIBLE));
        brands.get(BrandName.BENTLEY).addModel(getModelByName(BrandName.BENTLEY, ModelName.BENTLEY_FLYING_SPUR));
        brands.get(BrandName.BENTLEY).addModel(getModelByName(BrandName.BENTLEY, ModelName.BENTLEY_MULSANNE));
        brands.get(BrandName.BENTLEY).addModel(getModelByName(BrandName.BENTLEY, ModelName.BENTLEY_T_SERIES));

        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_1SERIES));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_2SERIES));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_3_SERIES));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_4_SERIES));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_5_SERIES));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_6_SERIES));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_7_SERIES));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_8_SERIES));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_I3));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_IX3));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_I4));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_I7));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_I8));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_M_SERIES));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_X_SERIES));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_Z_SERIES));
        brands.get(BrandName.BMW).addModel(getModelByName(BrandName.BMW, ModelName.BMW_IX));

        brands.get(BrandName.BUGATTI).addModel(getModelByName(BrandName.BUGATTI, ModelName.BUGATTI_BOLIDE));
        brands.get(BrandName.BUGATTI).addModel(getModelByName(BrandName.BUGATTI, ModelName.BUGATTI_CENTODIENCI));
        brands.get(BrandName.BUGATTI).addModel(getModelByName(BrandName.BUGATTI, ModelName.BUGATTI_CHIRON));
        brands.get(BrandName.BUGATTI).addModel(getModelByName(BrandName.BUGATTI, ModelName.BUGATTI_DIVO));
        brands.get(BrandName.BUGATTI).addModel(getModelByName(BrandName.BUGATTI, ModelName.BUGATTI_MISTRAL));
        brands.get(BrandName.BUGATTI).addModel(getModelByName(BrandName.BUGATTI, ModelName.BUGATTI_VEYRON));

        brands.get(BrandName.CADILLAC).addModel(getModelByName(BrandName.CADILLAC, ModelName.CADILLAC_ATS));
        brands.get(BrandName.CADILLAC).addModel(getModelByName(BrandName.CADILLAC, ModelName.CADILLAC_BLS));
        brands.get(BrandName.CADILLAC).addModel(getModelByName(BrandName.CADILLAC, ModelName.CADILLAC_CTS));
        brands.get(BrandName.CADILLAC).addModel(getModelByName(BrandName.CADILLAC, ModelName.CADILLAC_DTS));
        brands.get(BrandName.CADILLAC).addModel(getModelByName(BrandName.CADILLAC, ModelName.CADILLAC_ELR));
        brands.get(BrandName.CADILLAC).addModel(getModelByName(BrandName.CADILLAC, ModelName.CADILLAC_SRX));
        brands.get(BrandName.CADILLAC).addModel(getModelByName(BrandName.CADILLAC, ModelName.CADILLAC_STS));
        brands.get(BrandName.CADILLAC).addModel(getModelByName(BrandName.CADILLAC, ModelName.CADILLAC_XLR));
        brands.get(BrandName.CADILLAC).addModel(getModelByName(BrandName.CADILLAC, ModelName.CADILLAC_XTS));

        brands.get(BrandName.CHEVROLET).addModel(getModelByName(BrandName.CHEVROLET, ModelName.CHEVROLET_CAMARO));
        brands.get(BrandName.CHEVROLET).addModel(getModelByName(BrandName.CHEVROLET, ModelName.CHEVROLET_CAPTIVA));
        brands.get(BrandName.CHEVROLET).addModel(getModelByName(BrandName.CHEVROLET, ModelName.CHEVROLET_CRUZE));
        brands.get(BrandName.CHEVROLET).addModel(getModelByName(BrandName.CHEVROLET, ModelName.CHEVROLET_EQUINOX));
        brands.get(BrandName.CHEVROLET).addModel(getModelByName(BrandName.CHEVROLET, ModelName.CHEVROLET_IMPALA));
        brands.get(BrandName.CHEVROLET).addModel(getModelByName(BrandName.CHEVROLET, ModelName.CHEVROLET_MATIZ));
        brands.get(BrandName.CHEVROLET).addModel(getModelByName(BrandName.CHEVROLET, ModelName.CHEVROLET_PRISMA));
        brands.get(BrandName.CHEVROLET).addModel(getModelByName(BrandName.CHEVROLET, ModelName.CHEVROLET_TRACKER));
        brands.get(BrandName.CHEVROLET).addModel(getModelByName(BrandName.CHEVROLET, ModelName.CHEVROLET_TRAILBLAZER));
        brands.get(BrandName.CHEVROLET).addModel(getModelByName(BrandName.CHEVROLET, ModelName.CHEVROLET_TRAX));
        brands.get(BrandName.CHEVROLET).addModel(getModelByName(BrandName.CHEVROLET, ModelName.CHEVROLET_SUBURBAN));

        brands.get(BrandName.CHRYSLER).addModel(getModelByName(BrandName.CHRYSLER, ModelName.CHRYSLER_300));
        brands.get(BrandName.CHRYSLER).addModel(getModelByName(BrandName.CHRYSLER, ModelName.CHRYSLER_300C));
        brands.get(BrandName.CHRYSLER).addModel(getModelByName(BrandName.CHRYSLER, ModelName.CHRYSLER_CROSSFIRE));
        brands.get(BrandName.CHRYSLER).addModel(getModelByName(BrandName.CHRYSLER, ModelName.CHRYSLER_CRUISER));
        brands.get(BrandName.CHRYSLER).addModel(getModelByName(BrandName.CHRYSLER, ModelName.CHRYSLER_PACIFICA));
        brands.get(BrandName.CHRYSLER).addModel(getModelByName(BrandName.CHRYSLER, ModelName.CHRYSLER_TOWN_AND_CITY));
        brands.get(BrandName.CHRYSLER).addModel(getModelByName(BrandName.CHRYSLER, ModelName.CHRYSLER_VOYAGER));

        brands.get(BrandName.CITROEN).addModel(getModelByName(BrandName.CITROEN, ModelName.CITROEN_BERLINGO));
        brands.get(BrandName.CITROEN).addModel(getModelByName(BrandName.CITROEN, ModelName.CITROEN_C1));
        brands.get(BrandName.CITROEN).addModel(getModelByName(BrandName.CITROEN, ModelName.CITROEN_C3));
        brands.get(BrandName.CITROEN).addModel(getModelByName(BrandName.CITROEN, ModelName.CITROEN_C4));
        brands.get(BrandName.CITROEN).addModel(getModelByName(BrandName.CITROEN, ModelName.CITROEN_C5));
        brands.get(BrandName.CITROEN).addModel(getModelByName(BrandName.CITROEN, ModelName.CITROEN_C6));
        brands.get(BrandName.CITROEN).addModel(getModelByName(BrandName.CITROEN, ModelName.CITROEN_C8));
        brands.get(BrandName.CITROEN).addModel(getModelByName(BrandName.CITROEN, ModelName.CITROEN_CX));
        brands.get(BrandName.CITROEN).addModel(getModelByName(BrandName.CITROEN, ModelName.CITROEN_DS));

        brands.get(BrandName.DACIA).addModel(getModelByName(BrandName.DACIA, ModelName.DACIA_DOKKER));
        brands.get(BrandName.DACIA).addModel(getModelByName(BrandName.DACIA, ModelName.DACIA_DUSTER));
        brands.get(BrandName.DACIA).addModel(getModelByName(BrandName.DACIA, ModelName.DACIA_JOGGER));
        brands.get(BrandName.DACIA).addModel(getModelByName(BrandName.DACIA, ModelName.DACIA_LODGY));
        brands.get(BrandName.DACIA).addModel(getModelByName(BrandName.DACIA, ModelName.DACIA_LOGAN));
        brands.get(BrandName.DACIA).addModel(getModelByName(BrandName.DACIA, ModelName.DACIA_SANDERO));
        brands.get(BrandName.DACIA).addModel(getModelByName(BrandName.DACIA, ModelName.DACIA_SPRING));

        brands.get(BrandName.DAEWOO).addModel(getModelByName(BrandName.DAEWOO, ModelName.DAEWOO_GENTRA));
        brands.get(BrandName.DAEWOO).addModel(getModelByName(BrandName.DAEWOO, ModelName.DAEWOO_MAGNUS));
        brands.get(BrandName.DAEWOO).addModel(getModelByName(BrandName.DAEWOO, ModelName.DAEWOO_MATIZ));
        brands.get(BrandName.DAEWOO).addModel(getModelByName(BrandName.DAEWOO, ModelName.DAEWOO_TACUMA));
        brands.get(BrandName.DAEWOO).addModel(getModelByName(BrandName.DAEWOO, ModelName.DAEWOO_TOSCA));
        brands.get(BrandName.DAEWOO).addModel(getModelByName(BrandName.DAEWOO, ModelName.DAEWOO_WINSTORM));

        brands.get(BrandName.DAIHATSU).addModel(getModelByName(BrandName.DAIHATSU, ModelName.DAIHATSU_ALTIS));
        brands.get(BrandName.DAIHATSU).addModel(getModelByName(BrandName.DAIHATSU, ModelName.DAIHATSU_FEROZA));
        brands.get(BrandName.DAIHATSU).addModel(getModelByName(BrandName.DAIHATSU, ModelName.DAIHATSU_SIRION));
        brands.get(BrandName.DAIHATSU).addModel(getModelByName(BrandName.DAIHATSU, ModelName.DAIHATSU_VALERA));

        brands.get(BrandName.DATSU).addModel(getModelByName(BrandName.DATSU, ModelName.DATSU_DATSUN));
        brands.get(BrandName.DATSU).addModel(getModelByName(BrandName.DATSU, ModelName.DATSU_Z));

        brands.get(BrandName.DODGE).addModel(getModelByName(BrandName.DODGE, ModelName.DODGE_AVENGER));
        brands.get(BrandName.DODGE).addModel(getModelByName(BrandName.DODGE, ModelName.DODGE_CHALLENGER));
        brands.get(BrandName.DODGE).addModel(getModelByName(BrandName.DODGE, ModelName.DODGE_CHARGER));
        brands.get(BrandName.DODGE).addModel(getModelByName(BrandName.DODGE, ModelName.DODGE_DURANGO));
        brands.get(BrandName.DODGE).addModel(getModelByName(BrandName.DODGE, ModelName.DODGE_HORNET));
        brands.get(BrandName.DODGE).addModel(getModelByName(BrandName.DODGE, ModelName.DODGE_MAGNUM));
        brands.get(BrandName.DODGE).addModel(getModelByName(BrandName.DODGE, ModelName.DODGE_RAM));
        brands.get(BrandName.DODGE).addModel(getModelByName(BrandName.DODGE, ModelName.DODGE_VIPER));

        brands.get(BrandName.FERRARI).addModel(getModelByName(BrandName.FERRARI, ModelName.FERRARI_F8));
        brands.get(BrandName.FERRARI).addModel(getModelByName(BrandName.FERRARI, ModelName.FERRARI_F60));
        brands.get(BrandName.FERRARI).addModel(getModelByName(BrandName.FERRARI, ModelName.FERRARI_SF_90));
        brands.get(BrandName.FERRARI).addModel(getModelByName(BrandName.FERRARI, ModelName.FERRARI_GTC));
        brands.get(BrandName.FERRARI).addModel(getModelByName(BrandName.FERRARI, ModelName.FERRARI_ROMA));

        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_500));
        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_600));
        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_BRAVA));
        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_BRAVO));
        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_CROMA));
        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_DOBLO));
        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_MULTIPLA));
        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_PANDA));
        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_PUNTO));
        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_STILO));
        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_TIPO));
        brands.get(BrandName.FIAT).addModel(getModelByName(BrandName.FIAT, ModelName.FIAT_TOPOLINO));

        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_ESCORT));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_KA));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_EXPLORER));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_FIESTA));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_FOCUS));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_KUGA));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_MAVERICK));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_MUSTANG));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_PUMA));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_RANGER));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_RAPTOR));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_SIERRA));
        brands.get(BrandName.FORD).addModel(getModelByName(BrandName.FORD, ModelName.FORD_TAURUS));

        brands.get(BrandName.GREATWALL).addModel(getModelByName(BrandName.GREATWALL, ModelName.GREATWALL_COWRY));
        brands.get(BrandName.GREATWALL).addModel(getModelByName(BrandName.GREATWALL, ModelName.GREATWALL_HAVAL));
        brands.get(BrandName.GREATWALL).addModel(getModelByName(BrandName.GREATWALL, ModelName.GREATWALL_HOVER));
        brands.get(BrandName.GREATWALL).addModel(getModelByName(BrandName.GREATWALL, ModelName.GREATWALL_PEGASUS));
        brands.get(BrandName.GREATWALL).addModel(getModelByName(BrandName.GREATWALL, ModelName.GREATWALL_SAFE));
        brands.get(BrandName.GREATWALL).addModel(getModelByName(BrandName.GREATWALL, ModelName.GREATWALL_SUV));
        brands.get(BrandName.GREATWALL).addModel(getModelByName(BrandName.GREATWALL, ModelName.GREATWALL_VOLEEX));

        brands.get(BrandName.HONDA).addModel(getModelByName(BrandName.HONDA, ModelName.HONDA_ACCORD));
        brands.get(BrandName.HONDA).addModel(getModelByName(BrandName.HONDA, ModelName.HONDA_CR_V));
        brands.get(BrandName.HONDA).addModel(getModelByName(BrandName.HONDA, ModelName.HONDA_CIVIC));
        brands.get(BrandName.HONDA).addModel(getModelByName(BrandName.HONDA, ModelName.HONDA_HR_V));
        brands.get(BrandName.HONDA).addModel(getModelByName(BrandName.HONDA, ModelName.HONDA_ELEMENT));
        brands.get(BrandName.HONDA).addModel(getModelByName(BrandName.HONDA, ModelName.HONDA_JAZZ));
        brands.get(BrandName.HONDA).addModel(getModelByName(BrandName.HONDA, ModelName.HONDA_LEGEND));
        brands.get(BrandName.HONDA).addModel(getModelByName(BrandName.HONDA, ModelName.HONDA_FR_V));
        brands.get(BrandName.HONDA).addModel(getModelByName(BrandName.HONDA, ModelName.HONDA_ZR_V));

        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_ACCENT));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_I_10));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_I_20));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_I_30));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_I_40));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_IX_35));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_IONIQ));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_BAYON));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_SANTA_CRUZ));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_ELANTRA));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_KONA));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_SONATA));
        brands.get(BrandName.HYUNDAI).addModel(getModelByName(BrandName.HYUNDAI, ModelName.HYUNDAI_SANTA_FE));

        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_Q40));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_Q50));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_Q60));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_Q70));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_QX30));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_QX50));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_QX55));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_QX60));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_QX70));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_QX80));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_ESQ));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_EX));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_M));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_J));
        brands.get(BrandName.INFINITI).addModel(getModelByName(BrandName.INFINITI, ModelName.INFINITI_I));

        brands.get(BrandName.ISUZU).addModel(getModelByName(BrandName.ISUZU, ModelName.ISUZU_D_MAX));
        brands.get(BrandName.ISUZU).addModel(getModelByName(BrandName.ISUZU, ModelName.ISUZU_MU_X));

        brands.get(BrandName.JAGUAR).addModel(getModelByName(BrandName.JAGUAR, ModelName.JAGUAR_F_TYPE));
        brands.get(BrandName.JAGUAR).addModel(getModelByName(BrandName.JAGUAR, ModelName.JAGUAR_XE));
        brands.get(BrandName.JAGUAR).addModel(getModelByName(BrandName.JAGUAR, ModelName.JAGUAR_XF));
        brands.get(BrandName.JAGUAR).addModel(getModelByName(BrandName.JAGUAR, ModelName.JAGUAR_XK));
        brands.get(BrandName.JAGUAR).addModel(getModelByName(BrandName.JAGUAR, ModelName.JAGUAR_XFR));
        brands.get(BrandName.JAGUAR).addModel(getModelByName(BrandName.JAGUAR, ModelName.JAGUAR_XJR));
        brands.get(BrandName.JAGUAR).addModel(getModelByName(BrandName.JAGUAR, ModelName.JAGUAR_S_TYPE));

        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_CEED));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_CERATO));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_K5));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_K7));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_K9));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_JOICE));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_OPTIMA));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_PICANTO));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_SEDONA));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_SORENTO));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_SPORTAGE));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_STONIC));
        brands.get(BrandName.KIA).addModel(getModelByName(BrandName.KIA, ModelName.KIA_STINGER));

        brands.get(BrandName.LADA).addModel(getModelByName(BrandName.LADA, ModelName.LADA_KALINA));
        brands.get(BrandName.LADA).addModel(getModelByName(BrandName.LADA, ModelName.LADA_NIVA));
        brands.get(BrandName.LADA).addModel(getModelByName(BrandName.LADA, ModelName.LADA_NOVA));
        brands.get(BrandName.LADA).addModel(getModelByName(BrandName.LADA, ModelName.LADA_SAMARA));

        brands.get(BrandName.LAMBORGHINI).addModel(getModelByName(BrandName.LAMBORGHINI, ModelName.LAMBORGHINI_AVENTADOR));
        brands.get(BrandName.LAMBORGHINI).addModel(getModelByName(BrandName.LAMBORGHINI, ModelName.LAMBORGHINI_HURACAN));
        brands.get(BrandName.LAMBORGHINI).addModel(getModelByName(BrandName.LAMBORGHINI, ModelName.LAMBORGHINI_SIAN));
        brands.get(BrandName.LAMBORGHINI).addModel(getModelByName(BrandName.LAMBORGHINI, ModelName.LAMBORGHINI_URUS));
        brands.get(BrandName.LAMBORGHINI).addModel(getModelByName(BrandName.LAMBORGHINI, ModelName.LAMBORGHINI_REVUELTO));

        brands.get(BrandName.LANCIA).addModel(getModelByName(BrandName.LANCIA, ModelName.LANCIA_MUSA));
        brands.get(BrandName.LANCIA).addModel(getModelByName(BrandName.LANCIA, ModelName.LANCIA_PRISMA));
        brands.get(BrandName.LANCIA).addModel(getModelByName(BrandName.LANCIA, ModelName.LANCIA_VOYAGER));
        brands.get(BrandName.LANCIA).addModel(getModelByName(BrandName.LANCIA, ModelName.LANCIA_ZETA));
        brands.get(BrandName.LANCIA).addModel(getModelByName(BrandName.LANCIA, ModelName.LANCIA_YPSILON));

        brands.get(BrandName.LEXUS).addModel(getModelByName(BrandName.LEXUS, ModelName.LEXUS_ES));
        brands.get(BrandName.LEXUS).addModel(getModelByName(BrandName.LEXUS, ModelName.LEXUS_GX));
        brands.get(BrandName.LEXUS).addModel(getModelByName(BrandName.LEXUS, ModelName.LEXUS_IS));
        brands.get(BrandName.LEXUS).addModel(getModelByName(BrandName.LEXUS, ModelName.LEXUS_LX));
        brands.get(BrandName.LEXUS).addModel(getModelByName(BrandName.LEXUS, ModelName.LEXUS_NX));
        brands.get(BrandName.LEXUS).addModel(getModelByName(BrandName.LEXUS, ModelName.LEXUS_RX));

        brands.get(BrandName.LINCOLN).addModel(getModelByName(BrandName.LINCOLN, ModelName.LINCOLN_AVIATOR));
        brands.get(BrandName.LINCOLN).addModel(getModelByName(BrandName.LINCOLN, ModelName.LINCOLN_CONTINENTAL));
        brands.get(BrandName.LINCOLN).addModel(getModelByName(BrandName.LINCOLN, ModelName.LINCOLN_NAVIGATOR));
        brands.get(BrandName.LINCOLN).addModel(getModelByName(BrandName.LINCOLN, ModelName.LINCOLN_NAUTILUS));

        brands.get(BrandName.LOTUS).addModel(getModelByName(BrandName.LOTUS, ModelName.LOTUS_ELISE));
        brands.get(BrandName.LOTUS).addModel(getModelByName(BrandName.LOTUS, ModelName.LOTUS_EMIRA));
        brands.get(BrandName.LOTUS).addModel(getModelByName(BrandName.LOTUS, ModelName.LOTUS_EVORA));

        brands.get(BrandName.MASERATI).addModel(getModelByName(BrandName.MASERATI, ModelName.MASERATI_COUPE));
        brands.get(BrandName.MASERATI).addModel(getModelByName(BrandName.MASERATI, ModelName.MASERATI_GRANSPORT));
        brands.get(BrandName.MASERATI).addModel(getModelByName(BrandName.MASERATI, ModelName.MASERATI_SPYDER));
        brands.get(BrandName.MASERATI).addModel(getModelByName(BrandName.MASERATI, ModelName.MASERATI_GRAN_TURISMO));
        brands.get(BrandName.MASERATI).addModel(getModelByName(BrandName.MASERATI, ModelName.MASERATI_QUATTROPORTE));

        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_2));
        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_3));
        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_6));
        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_5));
        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_CX3));
        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_CX5));
        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_CX7));
        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_CX8));
        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_CX9));
        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_CX50));
        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_CX60));
        brands.get(BrandName.MAZDA).addModel(getModelByName(BrandName.MAZDA, ModelName.MAZDA_CX90));

        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_A));
        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_B));
        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_C));
        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_CL_SERIES));
        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_E));
        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_EQ_SERIES));
        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_G));
        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_GL));
        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_GL_SERIES));
        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_S));
        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_SLC));
        brands.get(BrandName.MERCEDES).addModel(getModelByName(BrandName.MERCEDES, ModelName.MERCEDES_SL_SERIES));

        brands.get(BrandName.MINI).addModel(getModelByName(BrandName.MINI, ModelName.MINI_CLASSIC));
        brands.get(BrandName.MINI).addModel(getModelByName(BrandName.MINI, ModelName.MINI_COUNTRYMAN));
        brands.get(BrandName.MINI).addModel(getModelByName(BrandName.MINI, ModelName.MINI_COUPE));

        brands.get(BrandName.MITSUBISHI).addModel(getModelByName(BrandName.MITSUBISHI, ModelName.MITSUBISHI_COLT));
        brands.get(BrandName.MITSUBISHI).addModel(getModelByName(BrandName.MITSUBISHI, ModelName.MITSUBISHI_L200));
        brands.get(BrandName.MITSUBISHI).addModel(getModelByName(BrandName.MITSUBISHI, ModelName.MITSUBISHI_ECLIPLSE));
        brands.get(BrandName.MITSUBISHI).addModel(getModelByName(BrandName.MITSUBISHI, ModelName.MITSUBISHI_GALANT));
        brands.get(BrandName.MITSUBISHI).addModel(getModelByName(BrandName.MITSUBISHI, ModelName.MITSUBISHI_LANCER));
        brands.get(BrandName.MITSUBISHI).addModel(getModelByName(BrandName.MITSUBISHI, ModelName.MITSUBISHI_PAJERO));
        brands.get(BrandName.MITSUBISHI).addModel(getModelByName(BrandName.MITSUBISHI, ModelName.MITSUBISHI_SIGMA));
        brands.get(BrandName.MITSUBISHI).addModel(getModelByName(BrandName.MITSUBISHI, ModelName.MITSUBISHI_OUTLANDER));

        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_350Z));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_ALMERA));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_MICRA));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_NAVARA));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_GTR));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_PATROL));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_PRIMERA));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_X_TRAIL));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_X_TERRA));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_TERRANO));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_SKYLINE));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_QASHQAI));
        brands.get(BrandName.NISSAN).addModel(getModelByName(BrandName.NISSAN, ModelName.NISSAN_JUKE));

        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_AGILA));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_ASTRA));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_CALIBRA));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_CORSA));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_FRONTERA));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_INSIGNIA));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_OMEGA));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_MOKKA));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_KADETT));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_ZAFIRA));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_VECTRA));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_TIGRA));
        brands.get(BrandName.OPEL).addModel(getModelByName(BrandName.OPEL, ModelName.OPEL_SIGNUM));

        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_100_SERIES));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_200_SERIES));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_2008));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_3008));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_300_SERIES));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_4007));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_4008));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_400_SERIES));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_508));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_5008));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_607));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_807));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_PARTNER));
        brands.get(BrandName.PEUGEOT).addModel(getModelByName(BrandName.PEUGEOT, ModelName.PEUGEOT_TRAVELLER));

        brands.get(BrandName.PORSCHE).addModel(getModelByName(BrandName.PORSCHE, ModelName.PORSCHE_911));
        brands.get(BrandName.PORSCHE).addModel(getModelByName(BrandName.PORSCHE, ModelName.PORSCHE_CAYENNE));
        brands.get(BrandName.PORSCHE).addModel(getModelByName(BrandName.PORSCHE, ModelName.PORSCHE_MACAN));
        brands.get(BrandName.PORSCHE).addModel(getModelByName(BrandName.PORSCHE, ModelName.PORSCHE_PANAMERA));
        brands.get(BrandName.PORSCHE).addModel(getModelByName(BrandName.PORSCHE, ModelName.PORSCHE_TAYCAN));

        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_ARKANA));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_CAPTUR));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_CLIO));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_ESCAPE));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_KADJAR));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_KANGOO));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_KIGER));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_LAGUNA));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_LOGAN));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_SANDERO));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_SCENIC));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_TALISMAN));
        brands.get(BrandName.RENAULT).addModel(getModelByName(BrandName.RENAULT, ModelName.RENAULT_MEGANE));

        brands.get(BrandName.ROLLSROYCE).addModel(getModelByName(BrandName.ROLLSROYCE, ModelName.ROLLSROYCE_CALLINAN));
        brands.get(BrandName.ROLLSROYCE).addModel(getModelByName(BrandName.ROLLSROYCE, ModelName.ROLLSROYCE_DAWN));
        brands.get(BrandName.ROLLSROYCE).addModel(getModelByName(BrandName.ROLLSROYCE, ModelName.ROLLSROYCE_GHOST));
        brands.get(BrandName.ROLLSROYCE).addModel(getModelByName(BrandName.ROLLSROYCE, ModelName.ROLLSROYCE_PHANTOM));
        brands.get(BrandName.ROLLSROYCE).addModel(getModelByName(BrandName.ROLLSROYCE, ModelName.ROLLSROYCE_SPECTRE));
        brands.get(BrandName.ROLLSROYCE).addModel(getModelByName(BrandName.ROLLSROYCE, ModelName.ROLLSROYCE_WRAITH));

        brands.get(BrandName.ROVER).addModel(getModelByName(BrandName.ROVER, ModelName.ROVER_DISCOVERY));
        brands.get(BrandName.ROVER).addModel(getModelByName(BrandName.ROVER, ModelName.ROVER_DEFENDER));
        brands.get(BrandName.ROVER).addModel(getModelByName(BrandName.ROVER, ModelName.ROVER_RANGE_ROVER));
        brands.get(BrandName.ROVER).addModel(getModelByName(BrandName.ROVER, ModelName.ROVER_EVOQUE));

        brands.get(BrandName.SAAB).addModel(getModelByName(BrandName.SAAB, ModelName.SAAB_AERO));
        brands.get(BrandName.SAAB).addModel(getModelByName(BrandName.SAAB, ModelName.SAAB_COUPE));
        brands.get(BrandName.SAAB).addModel(getModelByName(BrandName.SAAB, ModelName.SAAB_SPORT_COUPE));
        brands.get(BrandName.SAAB).addModel(getModelByName(BrandName.SAAB, ModelName.SAAB_SPORT_SEDAN));

        brands.get(BrandName.SEAT).addModel(getModelByName(BrandName.SEAT, ModelName.SEAT_ALHAMBRA));
        brands.get(BrandName.SEAT).addModel(getModelByName(BrandName.SEAT, ModelName.SEAT_ALTEA));
        brands.get(BrandName.SEAT).addModel(getModelByName(BrandName.SEAT, ModelName.SEAT_IBIZA));
        brands.get(BrandName.SEAT).addModel(getModelByName(BrandName.SEAT, ModelName.SEAT_LEON));
        brands.get(BrandName.SEAT).addModel(getModelByName(BrandName.SEAT, ModelName.SEAT_MII));
        brands.get(BrandName.SEAT).addModel(getModelByName(BrandName.SEAT, ModelName.SEAT_TOLEDO));

        brands.get(BrandName.SKODA).addModel(getModelByName(BrandName.SKODA, ModelName.SKODA_ENYAQ));
        brands.get(BrandName.SKODA).addModel(getModelByName(BrandName.SKODA, ModelName.SKODA_FABIA));
        brands.get(BrandName.SKODA).addModel(getModelByName(BrandName.SKODA, ModelName.SKODA_KAROQ));
        brands.get(BrandName.SKODA).addModel(getModelByName(BrandName.SKODA, ModelName.SKODA_KODIQ));
        brands.get(BrandName.SKODA).addModel(getModelByName(BrandName.SKODA, ModelName.SKODA_OCTAVIA));
        brands.get(BrandName.SKODA).addModel(getModelByName(BrandName.SKODA, ModelName.SKODA_RAPID));
        brands.get(BrandName.SKODA).addModel(getModelByName(BrandName.SKODA, ModelName.SKODA_SUPERB));
        brands.get(BrandName.SKODA).addModel(getModelByName(BrandName.SKODA, ModelName.SKODA_YETI));

        brands.get(BrandName.SMART).addModel(getModelByName(BrandName.SMART, ModelName.SMART_ELECTRIC));
        brands.get(BrandName.SMART).addModel(getModelByName(BrandName.SMART, ModelName.SMART_FORFOUR));
        brands.get(BrandName.SMART).addModel(getModelByName(BrandName.SMART, ModelName.SMART_SMART1));
        brands.get(BrandName.SMART).addModel(getModelByName(BrandName.SMART, ModelName.SMART_FORTWO));

        brands.get(BrandName.SSANGYONG).addModel(getModelByName(BrandName.SSANGYONG, ModelName.SSANGYONG_ACTYON));
        brands.get(BrandName.SSANGYONG).addModel(getModelByName(BrandName.SSANGYONG, ModelName.SSANGYONG_KORANDO));
        brands.get(BrandName.SSANGYONG).addModel(getModelByName(BrandName.SSANGYONG, ModelName.SSANGYONG_KYRON));
        brands.get(BrandName.SSANGYONG).addModel(getModelByName(BrandName.SSANGYONG, ModelName.SSANGYONG_REXTON));

        brands.get(BrandName.SUBARU).addModel(getModelByName(BrandName.SUBARU, ModelName.SUBARU_CROSSTREK));
        brands.get(BrandName.SUBARU).addModel(getModelByName(BrandName.SUBARU, ModelName.SUBARU_FORESTER));
        brands.get(BrandName.SUBARU).addModel(getModelByName(BrandName.SUBARU, ModelName.SUBARU_IMPREZA));
        brands.get(BrandName.SUBARU).addModel(getModelByName(BrandName.SUBARU, ModelName.SUBARU_LEGACY));
        brands.get(BrandName.SUBARU).addModel(getModelByName(BrandName.SUBARU, ModelName.SUBARU_OUTBACK));

        brands.get(BrandName.SUZUKI).addModel(getModelByName(BrandName.SUZUKI, ModelName.SUZUKI_VITARA));
        brands.get(BrandName.SUZUKI).addModel(getModelByName(BrandName.SUZUKI, ModelName.SUZUKI_FORENZA));
        brands.get(BrandName.SUZUKI).addModel(getModelByName(BrandName.SUZUKI, ModelName.SUZUKI_IGNIS));
        brands.get(BrandName.SUZUKI).addModel(getModelByName(BrandName.SUZUKI, ModelName.SUZUKI_SX4));
        brands.get(BrandName.SUZUKI).addModel(getModelByName(BrandName.SUZUKI, ModelName.SUZUKI_JIMNY));
        brands.get(BrandName.SUZUKI).addModel(getModelByName(BrandName.SUZUKI, ModelName.SUZUKI_SWIFT));

        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_AGYA));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_AURIS));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_AVENSIS));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_AYGO));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_C_HR));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_CELICA));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_COROLLA));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_LAND_CRUISER));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_HILLUX));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_C_HR));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_IQVERSO));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_TACOMA));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_TUNDRA));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_SEQUOIA));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_SUPRA));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_YARIS));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_RAV4));
        brands.get(BrandName.TOYOTA).addModel(getModelByName(BrandName.TOYOTA, ModelName.TOYOTA_PRIUS));

        brands.get(BrandName.TESLA).addModel(getModelByName(BrandName.TESLA, ModelName.TESLA_MODEL3));
        brands.get(BrandName.TESLA).addModel(getModelByName(BrandName.TESLA, ModelName.TESLA_CYBERTRUCK));
        brands.get(BrandName.TESLA).addModel(getModelByName(BrandName.TESLA, ModelName.TESLA_MODELS));
        brands.get(BrandName.TESLA).addModel(getModelByName(BrandName.TESLA, ModelName.TESLA_MODELX));
        brands.get(BrandName.TESLA).addModel(getModelByName(BrandName.TESLA, ModelName.TESLA_MODELY));
        brands.get(BrandName.TESLA).addModel(getModelByName(BrandName.TESLA, ModelName.TESLA_ROADSTER));

        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_C40));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_C70));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_S40));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_S60));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_S70));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_S90));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_S80));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_EM90));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_EX30));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_EX90));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_V40));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_V60));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_V70));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_V90));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_XC60));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_XC70));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_XC90));
        brands.get(BrandName.VOLVO).addModel(getModelByName(BrandName.VOLVO, ModelName.VOLVO_XC4));

        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_AMAROK));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_ARTEON));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_ATLAS));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_CADDY));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_CC));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_E_UP));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_GOLD));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_JETTA));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_PASSAT));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_PHAETON));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_POLO));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_T_ROC));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_TAIGO));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_TAURAN));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_TIGUAN));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_TOUAREG));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_TRANSPORTER));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_VENTO));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_SCIROCCO));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_SHARAN));
        brands.get(BrandName.VOLKSWAGEN).addModel(getModelByName(BrandName.VOLKSWAGEN, ModelName.VOLKSWAGEN_LUPO));*/

        /*brands.put(BrandName.MOTOR_INDIAN, new Brand(BrandName.MOTOR_INDIAN));
        brands.put(BrandName.MOTOR_APRILIA, new Brand(BrandName.MOTOR_APRILIA));
        brands.put(BrandName.MOTOR_BMW, new Brand(BrandName.MOTOR_BMW));
        brands.put(BrandName.MOTOR_DUCATI, new Brand(BrandName.MOTOR_DUCATI));
        brands.put(BrandName.MOTOR_HONDA, new Brand(BrandName.MOTOR_HONDA));
        brands.put(BrandName.MOTOR_HUSQVARNA, new Brand(BrandName.MOTOR_HUSQVARNA));
        brands.put(BrandName.MOTOR_KAWASAKI, new Brand(BrandName.MOTOR_KAWASAKI));
        brands.put(BrandName.MOTOR_KTM, new Brand(BrandName.MOTOR_KTM));
        brands.put(BrandName.MOTOR_TRIUMPH, new Brand(BrandName.MOTOR_TRIUMPH));
        brands.put(BrandName.MOTOR_YAMAHA, new Brand(BrandName.MOTOR_YAMAHA));
        brands.put(BrandName.MOTOR_SUZUKI, new Brand(BrandName.MOTOR_SUZUKI));*/

        brands.put(BrandName.AUDI, new Brand(BrandName.AUDI));
        models.put(ModelName.AUDI_R8, new Model(ModelName.AUDI_R8, getBrandByName(BrandName.AUDI)));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_R8));

        brands.put(BrandName.MOTOR_INDIAN, new Brand(BrandName.MOTOR_INDIAN));
        models.put(ModelName.MOTOR_APRILIA_AF, new Model(ModelName.MOTOR_APRILIA_AF, getBrandByName(BrandName.MOTOR_APRILIA)));
        brands.get(BrandName.MOTOR_APRILIA).addModel(getModelByName(BrandName.MOTOR_APRILIA, ModelName.MOTOR_APRILIA_AF));

    }

    public static Model getModelByName(BrandName brandName, ModelName modelName) {
        return models.values()
                .stream()
                .filter(model -> model.getBrand().getName().name().equals(brandName.name()) && model.getName().equals(modelName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("This model is not part of brand"));
    }

    public static Brand getBrandByName(BrandName brandName) {
        return brands.get(brandName);
    }
}
