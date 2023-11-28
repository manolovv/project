package architecture;

public abstract class Safety {
    private boolean gps;
    private boolean automaticStabilityControl;
    private boolean adaptiveHeadlights;
    private boolean antiLookSystem;
    private boolean brakeForceDistribution;
    private boolean electronicStabilizationProgram;
    private boolean tirePressureControl;
    private boolean parkTronic;
    private boolean tractionControlSystem;
    private boolean distanceControlSystem;
    private boolean airBagsFront;
    private boolean airBagsRear;
    private boolean airBagsSide;
    private boolean alarm;
    private boolean centralLooking;


    protected boolean isAlarm() {
        return alarm;
    }

    protected void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    protected boolean isCentralLooking() {
        return centralLooking;
    }

    protected void setCentralLooking(boolean centralLooking) {
        this.centralLooking = centralLooking;
    }

    protected boolean isGps() {
        return gps;
    }

    protected void setGps(boolean gps) {
        this.gps = gps;
    }

    protected boolean isAutomaticStabilityControl() {
        return automaticStabilityControl;
    }

    protected void setAutomaticStabilityControl(boolean automaticStabilityControl) {
        this.automaticStabilityControl = automaticStabilityControl;
    }

    protected boolean isAdaptiveHeadlights() {
        return adaptiveHeadlights;
    }

    protected void setAdaptiveHeadlights(boolean adaptiveHeadlights) {
        this.adaptiveHeadlights = adaptiveHeadlights;
    }

    protected boolean isAntiLookSystem() {
        return antiLookSystem;
    }

    protected void setAntiLookSystem(boolean antiLookSystem) {
        this.antiLookSystem = antiLookSystem;
    }

    protected boolean isBrakeForceDistribution() {
        return brakeForceDistribution;
    }

    protected void setBrakeForceDistribution(boolean brakeForceDistribution) {
        this.brakeForceDistribution = brakeForceDistribution;
    }

    protected boolean isElectronicStabilizationProgram() {
        return electronicStabilizationProgram;
    }

    protected void setElectronicStabilizationProgram(boolean electronicStabilizationProgram) {
        this.electronicStabilizationProgram = electronicStabilizationProgram;
    }

    protected boolean isTirePressureControl() {
        return tirePressureControl;
    }

    protected void setTirePressureControl(boolean tirePressureControl) {
        this.tirePressureControl = tirePressureControl;
    }

    protected boolean isParkTronic() {
        return parkTronic;
    }

    protected void setParkTronic(boolean parkTronic) {
        this.parkTronic = parkTronic;
    }

    protected boolean isTractionControlSystem() {
        return tractionControlSystem;
    }

    protected void setTractionControlSystem(boolean tractionControlSystem) {
        this.tractionControlSystem = tractionControlSystem;
    }

    protected boolean isDistanceControlSystem() {
        return distanceControlSystem;
    }

    protected void setDistanceControlSystem(boolean distanceControlSystem) {
        this.distanceControlSystem = distanceControlSystem;
    }

    protected boolean isAirBagsFront() {
        return airBagsFront;
    }

    protected void setAirBagsFront(boolean airBagsFront) {
        this.airBagsFront = airBagsFront;
    }

    protected boolean isAirBagsRear() {
        return airBagsRear;
    }

    protected void setAirBagsRear(boolean airBagsRear) {
        this.airBagsRear = airBagsRear;
    }

    protected boolean isAirBagsSide() {
        return airBagsSide;
    }

    protected void setAirBagsSide(boolean airBagsSide) {
        this.airBagsSide = airBagsSide;
    }
}